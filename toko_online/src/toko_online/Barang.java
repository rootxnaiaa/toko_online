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
public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>(); 
    private ArrayList<Integer> stok = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    Barang(){
    this.namaBarang.add("Paddle pop"); 
    this.stok.add(9999999); 
    this.harga.add(5000); 
    
    this.namaBarang.add("Sari Roti"); 
    this.stok.add(999999); 
    this.harga.add(17000); 
    
    this.namaBarang.add("Pure life"); 
    this.stok.add(999999); 
    this.harga.add(3000); 
    
    this.namaBarang.add("lottte xylitol"); 
    this.stok.add(999999); 
    this.harga.add(10000); 
    }
    
    public void setNamaBarang (String namaBarang){
        this.namaBarang.add(namaBarang); 
    }
    public String getNamaBarang(int idBarang){ 
        return this.namaBarang.get(idBarang); 
    }
    public void setStok(int stok){ 
        this.stok.add(stok);
    }
    public int getStok(int idBarang){ 
       return this.stok.get(idBarang); 
    }
    public void setHarga(int harga){
        this.harga.add(harga); 
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang); 
    }
    //jumlah barang : int 
    public int getJmlBarang(){
        return this.namaBarang.size(); 
    }
    
    public void editStok(int idBarang,int stok){
        this.stok.add(idBarang, stok); 
    }    
}