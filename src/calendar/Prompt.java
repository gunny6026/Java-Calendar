package calendar;

import java.util.Scanner;

public class Prompt {
	
	// week 요일명
	// return 0~6 ( 0= Sunday ~ 6= Saturday)
	// 첫 째날이 해당요일일 경우 return 값은 달력 첫줄의 공백 수
	public int parseDay(String week) {
		if(week.equals("Sun")) {
			return 0;
		}else if(week.equals("Mon")) {
			return 1;
		}else if(week.equals("Tue")) {
			return 2;
		}else if(week.equals("Wen")) {
			return 3;
		}else if(week.equals("Thu")) {
			return 4;
		}else if(week.equals("Fri")) {
			return 5;
		}else if(week.equals("Sat")){
			return 6;
		}
		return -1;
	}
	
	public void runPropmt(){
		Calendar01 cc = new Calendar01();
		Scanner scanner = new Scanner(System.in);
		Calendar02 c = new Calendar02();
	
		while(true) {
		System.out.println("년도를 입력하세요 :");
		System.out.println("year>");
		int year = scanner.nextInt();
		System.out.println("달을 입력하세요 :");
		System.out.println("month>");
		int month = scanner.nextInt();
		System.out.println("첫째 날의 요일을 입력하세요(Sun,Mon,Tue,Wen,Thu,Fri,Sat)");
		System.out.println("week>");
		String str_weekday = scanner.next();
		int week = parseDay(str_weekday);
		
		if(week ==-1) {
			System.out.println("다시 입력하세요");
			break;
		}
		
		
		if(month==0) {
			break;
		}else if(month<1 || month >12) {
			continue;
			
			
		}
		c.print(year, month, week );
		System.out.printf("%d월은 %d일 까지 있습니다. \n" , month , c.maxDaysofMonth(year, month));
		System.out.println(); 
		System.out.println("--------------------------");
		 System.out.println();
		
		
		}
		System.out.println("출력이 끝났습니다.");
		scanner.close();
	
		
	}
	
public static void main(String[] args) {
		
		// 셀 실행
		Prompt p = new Prompt();
		p.runPropmt();
		
		
		
	}

}
