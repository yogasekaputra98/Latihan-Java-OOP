class Lingkaran{
	double radius;
	static final double pi = 3.142312;
	
	public Lingkaran(){
		radius = 0.0f;
	}
	public Lingkaran(float _radius){
		radius = _radius;
	}

	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		if ( r > 0 ){
			radius = r;
		}
	}

	public void PrintInfo(){
			System.out.println("Jari - jari = " + radius);
		}

	public double hitungLuas(){
		return (pi * radius * radius);
	}
	
	public double hitungKeliling(){
		return (2 * pi * radius);
	}
	
}