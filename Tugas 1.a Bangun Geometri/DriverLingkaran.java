class DriverLingkaran{
	public static void main(String args[]){	
		Lingkaran Lg = new Lingkaran(5);
		Lg.PrintInfo();
		Lg.getRadius();
		Lg.setRadius(14);
		Lg.PrintInfo();
		System.out.println("Luas = " + Lg.hitungLuas());
		System.out.println("Keliling = " + Lg.hitungKeliling());	
	
	}
}