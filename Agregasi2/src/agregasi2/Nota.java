package agregasi2;

/**
 *
 * @author yogas
 */
public class Nota {
    private int Nonota;
    private final Produk[] daftar = new Produk[10];
    private int jumItem;
    
    public Nota (){
        jumItem = 0;
    }
    public int getNonota(){
        return Nonota;
    }
    public void setNonota(int Nota){
        this.Nonota = Nota;
    }
    public int getJumItem(){
        return jumItem;
    }
    public void setJumItem(int jumlah){
        this.jumItem = jumlah;
    }
    public void PrintInfo(){
        int th = getTotalHarga();
        float disc = getDiscount();
        System.out.println("No Nota : " + Nonota);
        for (int i = 0; i < jumItem; i++){
            daftar[i].PrintInfo();
        }
        System.out.println("\n Total Harga = " + getTotalHarga());
        System.out.println( "\n Discount= " + disc);
    }
    
    public int getTotalHarga(){
        int sum = 0;
        for (int i = 0; i < jumItem; i++){
            sum += daftar[i].getHarga();
        }
        return sum;
    }
    public float getDiscount(){
        if(getTotalHarga() > 250000)
            return (float) (getTotalHarga() * 0.05);
        return 0;
    }
    
    public void addProduk(Produk p){
        daftar[jumItem++] = p;
    }


}

