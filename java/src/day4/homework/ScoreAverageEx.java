package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {

		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 * (package : day4.homework, file : ScoreAverageEx)
		 * 성적은 정수.
		 * */
		
		int kor, eng, math;
		double avg;
		
		//국어 ,영어 ,수학순으로 성적을입력
		System.out.println("input score (kor, eng, math, ex : 100 90 80) : ");
		//평균을 계산
		//평균을 출력
		
		Scanner sc = new Scanner (System.in);
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		avg = (kor + eng + math) / 3.0; // = (double) 3;
		
		System.out.println("avg : " + avg);
		
		
		
		sc.close();
	}

}
