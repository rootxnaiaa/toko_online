/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toko_online;

/**
 *
 * @author Naila Rizki
 */
public class Toko_online {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Member member = new Member(); 
        Karyawan karyawan=new Karyawan(); 
        Laporan laporan=new Laporan(); 
        Transaksi transaksi=new Transaksi(); 
        Barang barang=new Barang(); 
        laporan.laporan(barang); 
        laporan.laporan(member); 
        laporan.laporan(transaksi, barang); 
        transaksi.prosesTransaksi(member, transaksi, barang);
        laporan.laporan(transaksi, barang);
        laporan.laporan(member);
    }
}
