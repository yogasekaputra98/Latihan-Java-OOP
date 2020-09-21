/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi2;

/**
 *
 * @author yogas
 */
public class Produk {
    private int kode;
    private String nama;
    private int harga;
    
    public Produk(){
    }
    public Produk(int kode, String nama, int harga){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }
    
    public int getkode(){
        return kode;
    }
    public void setkode(int kode){
        this.kode = kode;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    

    @Override
    public String toString(){
        return "Produk(" + kode + ", " + nama + ", " + harga + ")";
    }

    public void PrintInfo(){
        System.out.println(this);
    }
    

}

