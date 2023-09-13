package semiproject.board.controller;

import java.util.List;
import java.util.Scanner;

import db.day3.board.vo.BoardVO;
import semiproject.board.service.EPService;
import semiproject.board.service.EPServiceImp;
import semiproject.board.vo.EPVO;

public class EPController {

	private EPService epService = new EPServiceImp();
	
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
		List<EPVO> epList = epService.getEPList();
		for(EPVO tmp : epList) {
			System.out.println(tmp);
		}
		
	}
	private void Resignation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직원 번호 : ");
		int id = sc.nextInt();
		System.out.print("직원명 : ");
		String name = sc.next();
		
		EPVO ep = new EPVO(id, name, null, null, 0, 0, 0, 0, 0);
		if(epService.deleteEP(ep)) {
			System.out.println("[직원 정보 삭제 성공]");
		}else {
			System.out.println("[직원 정보 삭제 실패]");
		}
		
	}

	private void timeOff() {
		
	}
	private void Modify() {
		//수정할 게시글 정보(게시글 번호, 제목) 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 직원의 번호 : ");
		int ep_id = sc.nextInt();
		System.out.print("직원 이름 : ");
		sc.next();
		String ep_name = sc.nextLine();
		System.out.print("직원 이메일 : ");
		sc.next();
		String ep_email = sc.nextLine();
		System.out.print("연락처 : ");
		sc.next();
		String ep_phone_num = sc.nextLine();
		System.out.print("부서 : ");
		sc.next();
		int ep_dm_num = sc.nextInt();
		System.out.print("직급 : ");
		sc.next();
		int ep_po_num = sc.nextInt();
		System.out.print("근무 상태 : ");
		sc.next();
		int ep_st_num = sc.nextInt();
		System.out.print("남은 연차 : ");
		int ep_leave = sc.nextInt();
		System.out.print("급여 : ");
		int ep_salay = sc.nextInt();
		
		//EPVO ep = new EPVO(id, name, ep_email, ep_phone_num, null, null, null, 0, 0);
		EPVO ep = new EPVO(ep_id, ep_name, ep_email, ep_phone_num, ep_dm_num, ep_po_num, ep_st_num, ep_leave, ep_salay);
		
		System.out.println("입력완료");
		
		if(epService.updateEP(ep)) {
			System.out.println("[직원 정보 수정 성공]");
		}else {
			System.out.println("[직원 정보 수정 실패]");
		}
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
