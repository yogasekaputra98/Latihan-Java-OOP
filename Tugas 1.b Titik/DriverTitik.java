class DriverTitik{
		public static void main(String args[]){
			Titik T = new Titik(4,9);
			Titik trans = new Titik(4,9);
			Titik rots = new Titik(4,9);
			Titik dilat = new Titik(4,9);
			Titik reflekX = new Titik(4,9);
			Titik reflekY = new Titik(4,9);
			T.PrintInfo();
			
			trans.translasi(1,2);
			System.out.println("================================================");
			System.out.println("Translasi dengan Titik (1,2) \n" + "x = " + trans.getX() + "y = " + trans.getY());
			System.out.println("================================================");
			rots.rotasi(90);
			System.out.println("Rotasi dengan sudut 90 derajat \n " + "x = " + rots.getX() + "y = " + rots.getY());
			dilat.dilatasi(3);
			System.out.println("Dilatasi dengan konstanta 3\n " + "x = " + dilat.getX() + "y = " + dilat.getY());
			reflekX.mirrorSbX();
			System.out.println("Refleksi dengan Sumbu X " + "x = " + reflekX.getX() + " y = " + reflekX.getY());
			reflekX.mirrorSbY();
			System.out.println("Refleksi dengan Sumbu Y  " + "x = " + reflekY.getX() + " y = " + reflekY.getY());
			
			
		}		
}
