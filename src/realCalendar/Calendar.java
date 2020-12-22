package realCalendar;

public class Calendar {
	
	//달의 최대 일수 구하기
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//윤년이 있는 달의 최대 일수 구하기
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	

	//윤년 구하기
	public boolean isLeapYear(int year) {
		if(year % 4 ==0 && (year % 100 != 0 || year % 400 ==0))
			return true;
		else
			return false;
	}
	
	//윤년 일때와 아닐 때 최대 일수 구하기
	public int maxDaysofMonth(int year ,int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		}else {
			
			return MAX_DAYS[month-1];
		}
	}
	
	public void print(int year ,int month) {
		 System.out.printf("<<%4d년%3d월>> \n", year, month);
		 System.out.println("Sun Mon Tue Wen Thu Fri Sat");
		 System.out.println("----------------------------");
		 
		 
		 //get weekday automatically
		 int week = getWeekDay(year,month,1);
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
	}

	private int getWeekDay(int year, int month, int day) {
		//기준 날짜의 요일을 계산한다.
		//변수를 어떻게 설정 할까?
		int syear = 1970;
		int standardWeekday = 3; // 1970/Jan/1st = Thursday
		
		int count = 0;
		
		for(int i = syear; i< year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		for(int i =1; i< month; i++) {
			int delta = maxDaysofMonth(year, i);
			count += delta;
		}
		count += day;
		
		
		int weekday = (count+standardWeekday) % 7;
		
		return weekday;	
	}
	//simple test code here
			public static void main(String[] args) {
				Calendar c = new Calendar();
				c.getWeekDay(1970, 5, 1);
				c.getWeekDay(1971, 5, 1);
				c.getWeekDay(1990, 5, 1);
				
			}
}
