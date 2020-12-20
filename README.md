# Java-Calendar
JAVA Calendar 프로젝트

------

## 특정 달의 최대 일수 출력하기


* `달력을 구현하는 코드 `


**Calendar.java**
```
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
```

 `함수(메서드)`를 이용하여 재사용 가능하고 깔끔한 코드 구현
 
 
 **Calendar01.java**
 
 ```
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
 
 ```
 ------
 
 ## 달력 첫 째 날의 요일을 입력 받아 달력 구현하기
 
 **Calendar02.java**
 
 ```
 package calendar;



public class Calendar02 {
	
  //LEAP_MAX_DAYS는 윤년을 의미한다.
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	
  // 윤년이면 true를 리턴한다.
	public boolean isLeapYear(int year) {
		if(year % 4 ==0 && (year % 100 != 0 || year % 400 ==0))
			return true;
		else
			return false;
	}

  //매개변수로 년도와 달을 받는다.
  //해당 년도가 윤년일 경우 윤년에 해당하는 달을 리턴한다.
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

 ```
 
* 출력을 하는 main 함수가 있는 파일


**Prompt.java**
```
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
		
    //요일을 잘못 입력하면 -1을 리턴한다.
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

```
 
 -------
 
![image](https://user-images.githubusercontent.com/66653324/102713393-4bc78400-430b-11eb-9201-b1222b18d59f.png)

**년도, 월, 요일 입력을 받는다 **

![image](https://user-images.githubusercontent.com/66653324/102713420-6c8fd980-430b-11eb-83b5-f3fd3f3f01d3.png)

**출력 값**
