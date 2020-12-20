package calendar;

import java.util.Scanner;

public class Calendar01 {

	public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysofMonth(int month) {
		
		return MAX_DAYS[month-1];
	}
	public static void main(String[] args) {
		
		Calendar01 cc = new Calendar01();
			
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반복 횟수를 입력하세요 :");
		int repeat = scanner.nextInt();
		
		int i=1;
		while(i<=repeat) {
		
		System.out.println(i+". 달을 입력하세요 :");
		int month = scanner.nextInt();
		
		
		if(month <1 || month > 12) {
			System.out.println("1~12 까지 숫자만 입력하세요");
		}else {
			System.out.printf("%d월은 %d일 까지 있습니다. \n" , month , cc.maxDaysofMonth(month));
			
				
			
		}
		
		i++;
		
		
		}
		System.out.println("출력이 끝났습니다.");
		scanner.close();
		
		
	}
	


}
