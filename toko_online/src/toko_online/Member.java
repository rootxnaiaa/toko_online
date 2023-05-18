/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko_online;
import java.util.ArrayList;
/**
 *
 * @author Naila Rizki
 */
public class Member implements User { 
    
    private ArrayList <String> namaMember = new ArrayList <String>(); 
    private ArrayList <String> alamat = new ArrayList <String>(); 
    private ArrayList <String> telepon = new ArrayList <String>(); 
    private ArrayList <Integer> saldo = new ArrayList <Integer>(); 
    
    public Member(){
        this.namaMember.add("Elle"); 
        this.alamat.add("Virginia"); 
        this.telepon.add("08987654321"); 
        this.saldo.add(700000); 
        
        this.namaMember.add("Reid"); 
        this.alamat.add("Virginia"); 
        this.telepon.add("0898765432"); 
        this.saldo.add(550000); 
        
        this.namaMember.add("Morgan"); 
        this.alamat.add("Virginia"); 
        this.telepon.add("089876543"); 
        this.saldo.add(650000);  
        
        this.namaMember.add("Hotcher"); 
        this.alamat.add("Virginia"); 
        this.telepon.add("08987654"); 
        this.saldo.add(850000);
        
    }
    
    public void setSaldo (int saldo){ 
        this.saldo.add(saldo); 
    }
    
    public int getSaldo(int idMember){ 
        return this.saldo.get(idMember); 
    }
    
    //Untuk perubahan saldo member (yang dinamakan dengan OVERLOAD)  
    public void editSaldo (int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    
    //Untuk mengetahui jumlah data arraylist nama member 
    public int getJmlMember(){ 
        return this.namaMember.size(); 
    } 

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String Telepon) {
        this.telepon.add(Telepon); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember); 
         //To change body of generated methods, choose Tools | Templates.
    }
    
}