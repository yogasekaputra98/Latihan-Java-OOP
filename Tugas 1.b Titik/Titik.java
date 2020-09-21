class Titik{
	private float x;
	private float y;
	public Titik() {x = 0.0f; y = 0.0f;} // konstruktor 
	public Titik(float _x, float _y){
		x = _x; 		y = _y;
	}
	public float getX() { return x;}
	public float getY() { return y;}	
	public void setX(float _x) {x = _x;}
	public void setY(float _y) {y = _y;}
	
	public void PrintInfo(){
		System.out.println(" X = " + x);
		System.out.println(" Y = " + y);
		System.out.println(" Jarak Origin = " + hitungJarakOrigin());
		System.out.println(" Kuadran = " + HitungKuadran());
	}
	public double hitungJarakOrigin(){
		double hasil = Math.pow(x,2) + Math.pow(y,2);
		return Math.sqrt(hasil);
		
	}
	public int HitungKuadran(){
		if ((x > 0) && ( y>0)){
			return 1;
		}else if((x <0)&&(y > 0)){
			return 2;
		}else if((x<0)&&(y<0)){
			return 3;
		}else{
			return 4;
			}
		}
		
	
	
	public void translasi(int dx,int dy){
		x = x + dx;
		y = y + dy;
		
	}
	public void rotasi(double angle){
		float tempx;
		float tempy;
		tempx = x;
		tempy = y;
		if(angle == 90){
			x = tempy* -1;
			y = tempx;
		}else if(angle == 180){
			x =-1 * x;
			y =-1 * y;
		}
		
	}
	public void dilatasi(int skala){
		x = x * skala;
		y = y * skala;
		
	}
	public void mirrorSbX(){
		y = y*-1;
		
	}
	public void mirrorSbY(){
		x = x *-1;
	}
}

