package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		 System.out.println("일 월 화 수 목 금 토");
		 System.out.println("-----------------");
		 System.out.println("1  2  3  4  5  6  7");
		 System.out.println("8  9  10 11 12 13 14");
		 System.out.println("15 16 17 18 19 20 21");
		 System.out.println("22 23 24 25 26 27 28");
		 
		 
		 System.out.println("달을 입력하세요 :");
		 Scanner sc = new Scanner(System.in);
		 int month = sc.nextInt();
		 
		 if(month <1 || month >12) {
			System.out.println("1~ 12 숫자만 입력하세요"); 
		 }else {	 
				 int []maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
				//System.out.println(month+"월은"+maxDays[month-1]+"일 까지 있습니다.");
				 System.out.printf("%d월은 %d일까지 있습니다.\n" , month, maxDays[month-1]);
		 }
		 
		 sc.close();
		 
	}

}
