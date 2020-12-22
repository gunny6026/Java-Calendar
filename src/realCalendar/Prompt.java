package realCalendar;

import java.util.Scanner;





public class Prompt {
	Calendar cc = new Calendar();
	Scanner scanner = new Scanner(System.in);
	
	public void printMenu() {
		System.out.println("+----------------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+-----------------------------+");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt p = new Prompt();
		p.runPropmt();
		
	}
	public void runPropmt(){
		printMenu();
		
		
		
		
		while(true) {
			String cmd = scanner.next();
			if(cmd.equals("1")) {
				cmdRegister();
			}else if(cmd.equals("2")) {
				cmdSearch();
			}else if(cmd.equals("3")) {
				cmdCal();
			}else if(cmd.equals("h")) {
				printMenu();
			}else if(cmd.equals("q")) {
				 break;

			}else {
				continue;
			}
	}
		System.out.println("Thank you. Bye~");
		scanner.close();
	}

	private void cmdCal() {
		while(true) {
			
		
		System.out.println("년도를 입력하세요 :");
		System.out.println("year>");
		int year = scanner.nextInt();
		System.out.println("달을 입력하세요 :");
		System.out.println("month>");
		int month = scanner.nextInt();	
		System.out.println("종료 하려면 q를 누르세요");
		String exit =scanner.next();
		
		if(month==-1) {
			break;
		}else if(month<1 || month >12) {
			continue;
		}
		if(exit.equals("q")) {
			printMenu();
			break;
		}
		cc.print(year, month);
		System.out.printf("%d월은 %d일 까지 있습니다. \n" , month , cc.maxDaysofMonth(year, month));
		System.out.println(); 
		System.out.println("--------------------------");
		 System.out.println();
		
		}
		
}
		
	

	private void cmdSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}

}
