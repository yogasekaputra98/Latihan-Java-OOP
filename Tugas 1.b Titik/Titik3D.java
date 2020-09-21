class Titik3D{
	private float x;
	private float y;
	private float z;
	
	public Titik3D(){
	}
	public Titik3D(float tx, float ty, float tz){
		this.x = tx;
		this.y = ty;
		this.z = tz;
	}
	
	public float getX() { return x;}
	public float getY() { return y;}
	public float getZ() { return z;}	
	public void setX(float tx) {this.x = tx;}
	public void setY(float ty) {this.y = ty;}
	public void setZ(float tz) {this.z = tz;}
	
	public void PrintInfo(){
		System.out.println(" X = " + x);
		System.out.println(" Y = " + y);
		System.out.println(" Z = " + z);
				
		System.out.println(" Jarak Origin = " + hitungJarakOrigin());
		System.out.println(" Kuadran = " + HitungKuadran());
	}
	public double hitungJarakOrigin(){
		double hasil = Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2);
		return Math.sqrt(hasil);
		
	}
	
	public int HitungKuadran(){
		if( x > 0 &&  y>0  &&  z > 0 ){
			return 1;
		}
		else if( x <0 && y > 0 && z > 0 ){
			return 2;
		}
		else if( x<0 && y<0 &&  z > 0 ){
			return 3;
		}
		else if( x>0 && y<0 &&  z > 0 ){
			return 4;
		}
		else if( x>0 && y>0 && z < 0 ){
			return 5;
		}
		else if( x<0 && y>0 &&  z < 0 ){
			return 6;
		}
		else if( x<0 && y<0 && z < 0 ){
			return 7;
		}
		else{
			return 8;
		}	
	}
		
	

	
	public void translasi(int dx,int dy,int dz){
		x = x + dx;
		y = y + dy;
		z = z + dz;
	}
		
	public void mirrorSbX(){
		z = z * -1; //bidang xy
		
	}
	public void mirrorSbY(){
		//bidang XZ
		y = y * -1;
	}
	public void mirrorSbZ(){
		x = x * -1;
		//bidang yz
	}
	

}