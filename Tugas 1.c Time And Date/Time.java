class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int h, int m, int s){
		hour = h;
		minute = m;
		second = s;
	}
	public int getHour(){
		return hour;		
	}
	public int getMinute(){
		return minute;		
	}
	public int getSecond(){
		return second;		
	}
	
	public void setHour(int h){
		if ( h >= 0){
			hour = h;
		}
	}
	public void setMinute(int m){
		if ( m>= 0){
			minute = m;
		}
	}
	public void setSecond(int s){
		if ( s >= 0){
			second = s;
		}
	}
	
	public void printInfo(){
		System.out.println("Jam = " + hour);
		System.out.println("Menit = " + minute);
		System.out.println("Detik = " + second);
	}
	
	public boolean cekValid(){
		if ((hour >= 0) &&( hour <= 23 ) && (minute >= 0) &&( minute <= 59) && (second >= 0) &&( second <= 59)){
			return true;
		}else{
			return false;
		}
	}
	
	public int TimeToSecond(){
		if(cekValid()== true){
			return((hour * 3600) + (minute * 60) + second);
		}else{
			return 0;
		}
	}
}