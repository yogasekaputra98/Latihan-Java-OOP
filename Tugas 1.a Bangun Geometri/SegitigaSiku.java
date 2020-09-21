class SegitigaSiku{
	private int alas;
	private int tinggi;
	
	public SegitigaSiku(int a, int t){
		alas = a; 
		tinggi = t;
	}
	
	public int getAlas(){
		return alas;
	}
	public int getTinggi(){
		return tinggi;
	}
	public void setAlas(int a){
		if(a > 0){
			alas = a;
		}
	}
	
	public void setTinggi(int t){
		if(t > 0){
			tinggi = t;
		}
	}
	
	public void printinfo(){
		System.out.println("Alas = " + alas);
		System.out.println("Tinggi = " + tinggi);
	}

	
	public int hitungLuas(){
		return ((alas * tinggi)/2);
	}
	/*
	public int hitungKeliling(){
		int c ;
		c = (alas*alas) + (tinggi * tinggi);
		return (alas + tinggi); 
	}
	int a = Math.sqrt(25);
	System.out.println("Akar = " + a);
	*/
}