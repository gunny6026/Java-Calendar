package calendar;

import java.util.Scanner;

public class Calendar01 {

	public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysofMonth(int month) {
		
		return MAX_DAYS[month-1];
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요 :");
		
		int month = scanner.nextInt();
		Calendar01 cc = new Calendar01();
		
		if(month <1 || month > 12) {
			System.out.println("1~12 까지 숫자만 입력하세요");
		}else {
			System.out.printf("%d월은 %d일 까지 있습니다." , month , cc.maxDaysofMonth(month));
		}
		
		scanner.close();
	}
	


}
