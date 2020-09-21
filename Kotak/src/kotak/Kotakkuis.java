package kotak;

/**
 *
 * @author yogas
 */
public class Kotakkuis {
    private float p;
    private float l;
    private float t;  

    public Kotakkuis(float p, float l, float t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    

    public void cekvalid(){
        float temp, temp1;
        if ((p > t) && (p < l) &&( l > t)){  //2 3 1
            temp = l;
            l = p;
            p = temp;  
        }else if((t > p) &&(p > l) &&(t > l)){
            temp = p;
            p = t;
            t = l;
            l = temp;//213
        }else if((p<l)&&(p<t)&&(l<t)){// 1 2 3
            temp = p;
            p = t;
            t = temp;       
            
        }else if((p<l)&&(l>t)&&(p<t)){//231
            temp = p;
            p = l;
            l = temp;
            temp1 = t;
            t = l;
            l = temp1;
            
        }else if (l<t){
            //312
            temp = l;
            l = t;
            t = temp;
        }
        
        
    }
    
    /**
     *
     * @param b
     *  
     */
    public void StackKotak( Kotakkuis b ){
        float temp = b.p;
        float templ = b.l;
        float tempt = b.t ;
        
        if(p < temp){
            if (l < templ) {
                p = temp;
                l = templ;
            }else if(l > templ){
                p = temp;
            }
        }else if (p > temp){
            if(l < templ){
                l = templ;
            }
        }
       
        this.t = t + tempt;
    }
          

    /**
     *
     * @param a
     */
    public void SliceKotak(float a){
       this.p = p * a;
       this.l = l * a;
       this.t = t * a;
    }
        
    public void PrintInfo(){
        System.out.println("Panjang = " + p);
        System.out.println("Lebar = " + l);
        System.out.println("Tinggi = " + t);
    }
    
}