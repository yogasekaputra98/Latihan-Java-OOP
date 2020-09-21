class DriverSegiempat{
	public static void main(String args[]){
		Segiempat se = new Segiempat(7,4);
		se.getPanjang();
		se.getLebar();
		se.setPanjang(10);
		se.setLebar(9);
		se.printInfo();
		System.out.println("Luas = " + se.HitungLuas());
		System.out.println("Keliling = " + se.HitungKeliling());
	}
}