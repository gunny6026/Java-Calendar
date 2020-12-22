package realCalendar;

import java.util.Scanner;





public class Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt p = new Prompt();
		p.runPropmt();
		
	}
	public void runPropmt(){
		Calendar cc = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("년도를 입력하세요 :");
		System.out.println("year>");
		int year = scanner.nextInt();
		System.out.println("달을 입력하세요 :");
		System.out.println("month>");
		int month = scanner.nextInt();	
		
		if(month==0) {
			break;
		}else if(month<1 || month >12) {
			continue;
			
			
		}
		cc.print(year, month);
		System.out.printf("%d월은 %d일 까지 있습니다. \n" , month , cc.maxDaysofMonth(year, month));
		System.out.println(); 
		System.out.println("--------------------------");
		 System.out.println();
		
		
		}
		System.out.println("출력이 끝났습니다.");
		scanner.close();
	
		
	}

}
