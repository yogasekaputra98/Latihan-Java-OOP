class Segiempat{
	private int panjang;
	private int lebar;
	
	public Segiempat(){
		this.panjang = 1;
		this.lebar = 1;
	}
	
	public Segiempat(int _panjang, int _lebar){
		this.panjang = _panjang;
		this.lebar = _lebar;
	}
	
	public void printInfo(){
		System.out.println("Panjang = " + panjang);
		System.out.println("Lebar = " +lebar);
	}
	public int getPanjang(){
		return panjang;
	}
	public int getLebar(){
		return lebar;
	}
	public void setPanjang(int p){
		if(p > 0){
			this.panjang = p;
		}
	}
	public void setLebar(int s){
		if (s > 0) {
			this.lebar = s;
		}
	}
	public int HitungLuas(){
		return panjang * lebar;
	}
	public int HitungKeliling(){
		return (2*lebar) + (2 * panjang);
	}
}