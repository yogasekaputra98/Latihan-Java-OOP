class DriverSegitigaSiku{
	public static void main(String args[]){
		SegitigaSiku se = new SegitigaSiku(10,4);
		se.getAlas();
		se.getTinggi();
		se.setAlas(20);
		se.setTinggi(9);
		se.printinfo();
		System.out.println("Luas = " + se.hitungLuas());
		//System.out.println("Keliling = " + se.hitungKeliling());
	}
}