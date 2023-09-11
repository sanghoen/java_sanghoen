package semiproject.board.controller;

import java.util.Scanner;

public class Main {
	
	private static EPController epController = new EPController();

	public static void main(String[] args) {
		int menu;
		final int EXIT = 4;
		Scanner sc = new Scanner(System.in);
		
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("=================");
		}while(menu != EXIT);
		
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			epController.run();
			break;
		case 2:
			projectController();
			break;
		case 3:
			attendanceController();
			break;
		case 4:
			System.out.println("[뒤로가기]");
			break;
		default:
			System.out.println("[잘못된 메뉴 입력]");
		}
	}


	private static void attendanceController() {
		
	}

	private static void projectController() {
		
	}

	private static void printMenu() {
		System.out.println("=====게시판메뉴=====");
		System.out.println("1. 직원 메뉴");
		System.out.println("2. 프로젝트 메뉴");
		System.out.println("3. 출결관리");
		System.out.println("4. 뒤로가기");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
	}
	
}










