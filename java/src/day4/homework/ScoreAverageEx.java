package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {

		int kor;
		int eng;
		int math;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter Korean, English, and Mathematics. : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		System.out.println(avg);
		
		
		
		sc.close();
	}

}
