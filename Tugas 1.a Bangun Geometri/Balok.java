class Balok{
	private int tinggi;
	private int lebar;
	private int panjang;
	
	public Balok(int _panjang, int _tinggi, int _lebar){
		tinggi = _tinggi;
		panjang = _panjang;
		lebar = _lebar;
		
	}
	
	public int getPanjang(){
		return panjang;
	}
	public int getLebar(){
		return lebar;
	}
	public int getTinggi(){
		return tinggi;
	}
	
	public void setPanjang(int p){
		if(p > 0){
			panjang = p;
		}
	}
	public void setLebar(int s){
		if (s > 0) {
			lebar = s;
		}
	}
	public void setTinggi(int t){
		if(t > 0){
			tinggi = t;
		}
	}
	public void printinfo(){
		System.out.println("Panjang = " + panjang);
		System.out.println("Lebar = " + lebar);
		System.out.println("Tinggi = " + tinggi);	
	}
	public double HitungVolume(){
		return (panjang * lebar * tinggi );
	}	
	
	public double HitungLuasPermukaan(){
		return (2 * (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
	}
}