class DriverTitik3D{
	public static void main(String args[]){
		Titik3D T3 = new Titik3D(5,6,7);
		/*T3.getX();
		T3.getY();
		T3.getZ();
		T3.setX();
		T3.setY();
		T3.setZ();*/
		T3.hitungJarakOrigin();
		T3.HitungKuadran();
		T3.PrintInfo();
		T3.translasi(7,6,5);
		System.out.println("================================================");
		System.out.println("Translasi dengan Titik (7,6,5) \n" + "x = " + T3.getX() + " y = " + T3.getY() + " z = " + T3.getZ());
		System.out.println("================================================");
		
		
		T3.mirrorSbX();
		System.out.println("Refleksi dengan Bidang XY " + "x = " + T3.getX() + " y = " + T3.getY() + " z = " + T3.getZ());
		System.out.println("============================================================================");
		T3.mirrorSbY();
		System.out.println("Refleksi dengan Sumbu XZ " + "x = " + T3.getX() + " y = " + T3.getY() + " z = " + T3.getZ());
		System.out.println("============================================================================");
		T3.mirrorSbZ();
		System.out.println("Refleksi dengan Sumbu YZ  " + "x = " + T3.getX() + " y = " + T3.getY() + " z = " + T3.getZ());
		System.out.println("============================================================================");
			
	}

}