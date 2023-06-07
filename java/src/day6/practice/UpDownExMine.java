package day6.practice;

import java.util.Scanner;

public class UpDownExMine {

	public static void main(String[] args) {

		/* UpDown 게임을 하는 코드를 작성하세요.
		 * 한판이 끝나면 더할건지를 물어서 n을 입력하면 종료,
		 * y를 입력하면 이어서 게임이 진행.
		 */
		
		int min = 1, max = 100;
		int num = min - 1; // 1~100이 아닌 정수로 초기화 하면 됨. 최소값 -1을 해서 랜덤으로 나올 수 없는 수.
		int random;
		char menu = 'y';
		
		Scanner sc = new Scanner(System.in);
		
		random = (int)(Math.random()*(max - min + 1) + min);
		System.out.println(random);
			
		while(random != num) {
		
			System.out.println("input (1~100) : ");
			num = sc.nextInt();
			
			if(num > random) {
				System.out.println("Down!");
			}else if(num < random) {
				System.out.println("Up!");
			}else {
				System.out.println("Good!");
				System.out.println("continue?(y/n) : ");
				
				menu = sc.next().charAt(0);
				
			}
			System.out.println("EXIT!");
		}
		
		
		sc.close();
	}

}