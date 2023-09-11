package semiproject.board.controller;

import java.util.List;
import java.util.Scanner;

import db.day3.board.vo.BoardVO;
import semiproject.board.service.EPService;
import semiproject.board.vo.EPVO;

public class EPController {

	public void run() {
		int menu;
		final int EXIT = 5;
		Scanner sc = new Scanner(System.in);
		
		do {
			EPprintMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("=================");
		}while(menu != EXIT);
		
	}
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			Inquiry();
			break;
		case 2:
			Resignation();
			break;
		case 3:
			timeOff();
			break;
		case 4:
			Modify();
			break;
		case 5:
			System.out.println("[뒤로가기]");
			break;
		default:
			System.out.println("[잘못된 메뉴 입력]");
		
		}
	}

	private void Inquiry() {
		List<EPVO> epList = EPService.getEPList();
		for(EPVO tmp : epList) {
			System.out.println(tmp);
				}
	}
	private void Resignation() {
		
	}
	private void timeOff() {
		
	}
	private void Modify() {
		
	}
	private static void EPprintMenu() {
		System.out.println("=====게시판메뉴=====");
		System.out.println("1. 조회");
		System.out.println("2. 퇴사");
		System.out.println("3. 휴직");
		System.out.println("4. 반려/수정");
		System.out.println("5. 뒤로가기");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
	}

}
