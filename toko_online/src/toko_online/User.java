/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package toko_online;

/**
 *
 * @author Naila Rizki
 */
public interface User {
    public abstract void setNama (String nama); 
    public abstract void setAlamat (String alamat); 
    public abstract void setTelepon (String Telepon); 
    
    public String getNama (int id); 
    public String getAlamat (int id); 
    public String getTelepon (int id); 
    
}
