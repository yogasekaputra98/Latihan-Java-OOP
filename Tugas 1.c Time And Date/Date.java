class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(int d,int m, int y){
		day = d;
		month = m;
		year = y;
	}
	public int getDay(){
		return day;		
	}
	public int getMonth(){
		return month;		
	}
	public int getYear(){
		return year;		
	}
	
	public void setDay(int d){
		if ( d >= 0){
			day = d;
		}
	}
	public void setMonth(int m){
		if ( m>= 0){
			month = m;
		}
	}
	public void setYear(int y){
		if ( y >= 0){
			year = y;
		}
	}
	
	public void printInfo(){
		System.out.println("Hari = " + day);
		System.out.println("Bulan = " + month);
		System.out.println("Tahun = " + year);
		if(cekKabisat() == true){
			System.out.println(year + "	Tahun Kabisat");
		}else{
			System.out.println(year + "	Bukan Tahun Kabisat");
		}
	}
	public boolean cekValid(){
		if ((day >= 0) &&( day <= 31 ) && (month >= 1) &&( month <= 12) && (year >= 1990) &&( year <= 3000)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean cekKabisat(){
		if((cekValid() == true)&&(year % 4 == 0 )){
			return true;
		}else{
			return false;
		}
	}
	

}