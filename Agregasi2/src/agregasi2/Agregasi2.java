/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi2;

public class Agregasi2 {
    public static void main(String[] args) {
       Nota n = new Nota();
       Produk p = new Produk(1,"Mouse",25000);
       Produk q = new Produk(2,"Monitor",55000);
       Produk r = new Produk(3,"Keyboard",30000);
       
       n.addProduk(p);
       n.addProduk(q);
       n.addProduk(r);
       n.PrintInfo();
       
    }
    
}
