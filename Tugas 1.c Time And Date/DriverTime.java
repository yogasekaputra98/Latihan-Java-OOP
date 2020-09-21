class DriverTime{
	public static void main(String args[]){
		Time T = new Time(5,23,40);
		T.getHour();
		T.getMinute();
		T.getSecond();
		T.setHour(2);
		T.setMinute(39);
		T.setSecond(59);
		T.printInfo();
		System.out.println("Konversi Time To Second = " + T.TimeToSecond() + " Detik");
		
	}

}