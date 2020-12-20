package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		 
		 
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
