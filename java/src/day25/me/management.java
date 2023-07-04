package day25.me;

import java.util.Scanner;

public class management implements Program{

	private static final int EXIT = 3;
	
	private Scanner sc = new Scanner(System.in);

	
	
	@Override
	public void printMenu() {

		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 종료");
		
	}

	@Override
	public void run() {
		System.out.println("학생 관리 프로그램 시작.");

		int menu;
		do {
			printMenu();

			menu = sc.nextInt();

			runMenu(menu);

		}while(menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:
			Registration();
			break;
		case 2:
			Check();
			break;
		case 3:
			EXIT();
			break;
		default:
			System.out.println("");
	
		}	
		sc.close();
	}

	private void Registration() {
		System.out.print("학번 : ");
		int classOf = sc.nextInt();

		System.out.print("과 : ");
		int department = sc.nextInt();

		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("등록완료");
	}

	private void Check() {
		
	}

	private void EXIT() {
		System.out.println("종료!");
	}


}
	