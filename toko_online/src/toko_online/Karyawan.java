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
public class Karyawan implements User {
    private ArrayList<String> namaKaryawan = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> jabatan = new ArrayList<Integer>(); 
    
    Karyawan(){ 
    this.namaKaryawan.add("Nairobi"); 
    this.alamat.add("Virginia"); 
    this.telepon.add("08987654321"); 
    this.jabatan.add(0); 
    }
    
    public void setJabatan(int jabatan){ 
        this.jabatan.add(jabatan); 
    }
    
    public int getJabatan(int idMember){
        return this.jabatan.get(idMember); 
    }
    
    public int getJmlKaryawan(){ 
        return this.namaKaryawan.size(); 
    }
    
    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);  
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String Telepon) {
     this.telepon.add(Telepon);  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idKaryawan) {
         return this.namaKaryawan.get(idKaryawan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idKaryawan) {
         return this.alamat.get(idKaryawan);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idKaryawan) {
       return this.telepon.get(idKaryawan);//To change body of generated methods, choose Tools | Templates.
    }  
}