package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		
		/* 두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
		 * (package : day4.homework, file : MaxEx)
		 **/
		

		int num1, num2;
		int max; // 두 수 중 큰 수를 저장할 변수
		
		//두 정수를 입력
		
		//큰 수를 max에 저장
		//num1이 num2보다 크거나 같으면 max에 num1를 저장
		//~면 = if
		
		//아니면 max에 num2를 저장 
		
		//max를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 integer numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//큰 수를 max에 저장
		//num1이 num2보다 크거나 같으면 max에 num1를 저장
		
		if(num1>=num2) {
			max = num1;
		} 
		//아니면 max에 num2를 저장
		else {
			max = num2;
		}
		//max를 출력
		System.out.println("the greater number of " + num1 + " or " + num2
				+ " is " + max);
		max = 100;
		max = num1 >= num2 ? num1 : num2;//조건연산자. 위와 비교 했을 때, 코드가 깔끔해짐
		System.out.println("the greater number of " + num1 + " or " + num2
				+ " is " + max);
		sc.close();
	}

}
