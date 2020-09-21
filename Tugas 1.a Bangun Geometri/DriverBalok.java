class DriverBalok{
	public static void main(String args[]){	
		Balok Bl = new Balok(5,6,7);
		Bl.printinfo();
		System.out.println("Sebelum di Ubah menggunakan method Get dan Set");
		Bl.getPanjang();
		Bl.getLebar();
		Bl.getTinggi();
		Bl.setPanjang(10);
		Bl.setLebar(12);
		Bl.setTinggi(14);
		Bl.printinfo();
		System.out.println("Volume = " + Bl.HitungVolume());
		System.out.println("Luas Permukaan = " + Bl.HitungLuasPermukaan());	
	
	}
}