package day4.practice;

import java.util.Scanner;

public class IfAdultEx {

	public static void main(String[] args) {
		/*나이를 입력 받아 나이가 20세 이상이면 adult를 출력하고,
		 * 20세 미만이면 minor로 출력하는 코드를 작성하세요.
		if else문을 이용*/
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input age : ");
		age = sc.nextInt();
		
		//나이를 입력 받아 나이가 20세 이상이면 adult를 출력하고,
		/*if(age가 20세 이상이다) {
			System.out.println("adult!");
		}*/
		//아니면 minor로 출력
		
		if (age >= 20) {
			System.out.println("adult!");
		} else {
			System.out.println("minor!");
		}
		
		sc.close();
	}

}
