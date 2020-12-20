package calendar;



public class Calendar02 {
	

	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	
	public boolean isLeapYear(int year) {
		if(year % 4 ==0 && (year % 100 != 0 || year % 400 ==0))
			return true;
		else
			return false;
	}

	public int maxDaysofMonth(int year ,int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		}else {
			
			return MAX_DAYS[month-1];
		}
	}
	
	public void print(int year ,int month, int week) {
		 System.out.printf("<<%4d년%3d월>> \n", year, month);
		 System.out.println("Sun Mon Tue Wen Thu Fri Sat");
		 System.out.println("----------------------------");
		 
		 //해당 요일의 return값 만큼 공백으로 채움
		 for(int i=0; i< week; i++) {
			 System.out.print("    ");
		 }
		 //공백으로 채운뒤 count 만큼 첫줄 채움
		 int count = 7-week;
		 for(int i=1; i<=count; i++) {
			 System.out.printf("%3d ", i);
		 }
		 System.out.println();
		 
		 //2번째 줄 부터 마지막 까지
		 int maxday = maxDaysofMonth(year ,month);
		 for(int i=count+1; i<=maxday; i++) {
			System.out.printf("%3d ", i);
			if( (i+week) %7==0) {
				System.out.println();
			}
		 }
		 System.out.println();
		
		 
		
		 
//		 System.out.println("1  2  3  4  5  6  7");
//		 System.out.println("8  9  10 11 12 13 14");
//		 System.out.println("15 16 17 18 19 20 21");
//		 System.out.println("22 23 24 25 26 27 28");
	}
	

}
