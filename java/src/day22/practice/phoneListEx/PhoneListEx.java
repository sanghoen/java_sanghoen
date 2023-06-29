package day22.practice.phoneListEx;

import java.util.Scanner;

public class PhoneListEx {

	public static void main(String[] args) {

		/* 전화번호를 관리하는 프로그램을 작성하세요.
		 * 
		 * 1. 전화번호 등록
		 * 2. 전화번호 수정
		 * 3. 전화번호 검색
		 * 4. 프로그램 종료
		 * */
	private Scanner sc = new Scanner(System.in);
		
	public void run() {
		System.out.println("Program Start!");
		
		int menu;
		
		do {
			try {
				System.out.println();
				printMenu();
				menu = sc.nextInt();
				
				runMenu1(menu);
			}catch() {
				menu = EXIT-1;
				sc.nextLine();
				System.out.println("Wrong Input!");
			}
		}while(menu != EXIT);
	
	}

		private void printMenu() {
			System.out.println("menu");
			System.out.println("1. Phone number registration");
			System.out.println("2. Modify Phone Number");
			System.out.println("3. Search Phone Numbers");
			System.out.println("4. Exit the program");
		}

		private void runMenu(menu) {
			public void runMenu(menu) {
				switch(menu) {
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					search();
					break;
				case 4:
					delete();
					break;
				default:
				}
			}
		}

}



