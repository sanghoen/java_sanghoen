package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {

		/*월을 입력받아 입력받은 월의 계정을 출력하세요.
		 * 3, 4, 5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10, 11 : 가을
		 * 12, 1, 2 : 겨울
		 * 그 외 : 잘못된 월
		 **/
	
		int month;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("spring");
		}else if (month == 6 || month == 7 || month == 8) {
			System.out.println("Summer");
		}else if (month == 9 || month == 10 || month == 11) {
			System.out.println("fall");
		}else if (month == 12 || month == 1 || month == 2) {
			System.out.println("winter");
		}else {
			System.out.println("wrong month");
		}
		//월이 3이상이고 5이하이면 봄이라고 출력하고
		if(month >= 3 && month <= 5) {
			System.out.println("spring!");
		}else if (month >= 6 && month <= 8) {
			System.out.println("Summer!");
		}else if (month >= 9 && month <= 11) {
			System.out.println("fall!");
		}
		//월이 12이거나 월이 1이상이고 2이하이면
		//서로 다른 연산자가 섞여 있는 경우에 문제가 될 '수' 있다.
		//연산 순서가 같으면 먼저 해야 할 작업에 가로를 쳐 주어야 한다
		else if (month == 12 || (month >= 1 && month <= 2)) {
			System.out.println("winter!");
		}else { 
			System.out.println("wrong month!");
		}
		sc.close();
	}

}
