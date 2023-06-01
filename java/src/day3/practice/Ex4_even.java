package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {

		/* 정수 num을 입력 받아서, num이 홀수인지 짝수인지 판별하는 코드를 작성하세요.
		 * (package : day.pratice, file : Ex4_even)
		 * num을 2로 나누었을 때 나머지가 0이 아니면 0dd number라고 출력하고
		 * num을 2로 나누었을 때 나머지가 0이면 even number라고 출력
		 */
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(num % 2 != 0) {
			System.out.println(num + " = 0dd number");
		}
		
		if(num % 2 == 0) {
			System.out.println(num + " = even number");
		}
		
		sc.close();
	}

}
