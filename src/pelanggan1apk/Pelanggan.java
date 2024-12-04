/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelanggan1apk;

/**
 *
 * @author MSI
 */
public class Pelanggan {
    private String id, nama, jenis;
    private int tahunLahir;
    
    public Pelanggan(String id, String nama, String jenis, int tahunLahir){
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.tahunLahir = tahunLahir;
    }
    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getJenis(){
        return jenis;
    }
    public int getTahunLahir(){
        return tahunLahir;
    }
}
