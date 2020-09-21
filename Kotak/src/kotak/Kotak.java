package kotak;

/**
 *
 * @author yogas
 */
public class Kotak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotakkuis  k1 = new Kotakkuis(1,3,2);
        Kotakkuis  k2 = new Kotakkuis(5,6,3);
        
        k1.cekvalid(); 
        k1.PrintInfo();
        System.out.println("\n");
        
        k2.cekvalid();
        k2.PrintInfo();
        System.out.println("\n");
        k1.StackKotak(k2);
        k1.PrintInfo();
        k1.SliceKotak((float) 0.5); 
        k1.PrintInfo();
        
      
        
}
}


