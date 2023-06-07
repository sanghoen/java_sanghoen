package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {

		/* input 3 score(kor, eng, math) : 10 20 30
		 * average : 20.0
		 * continue?(y/n) : 
		 * y
		 * input 3 score(kor, eng, math) : 90 95 100
		 * average : 95.0
		 * continue?(y/n) : n
		 * EXIT!
		*/
		
		/* 국어, 영어, 수학 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		 * n을 입력하기 전까지
		 * */
		
		//반복문 : menu가 n이 아니면 반복(y, n이 아닌 다른 문자를 입력하면 반복)
		//       menu가 y이면 반복(y, n이 아닌 다른 문자를 입력하면 종료) 둘 중 하나 선택
		
			//국어, 영어, 수학 점수 입력
		
			//평균을 계산
		
			//평균을 출력
		
			//더할건지 물어본 후, 입력
		
		//EXIT!를 출력
		
		int kor, eng, math;
		char menu = 'y'; //(y 또는 n이기 때문에 char로 처리)
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input your Korean, English, and math scores");

		
		System.out.println("");
		
		while(menu != 'n') {
			System.out.println("input score(kor, eng, math) : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			avg = (kor + eng + math) / 3.0;
			
			System.out.println("average : " + avg);
			
			System.out.println("continue?(y/n) : ");
			
			menu = sc.next().charAt(0);
			
		}
		
		System.out.println("EXIT!");

		sc.close();
	}

}
