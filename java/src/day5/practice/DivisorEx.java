package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {

		//정수 num을 입력받아 약수를 출력하는 코드를 작성하세요.
		
		/* 약수 : A를 B로 나누었을 때 나머지가 0이면 B는 A의 약수이다.
		 * 
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * */
		
		
		/* 반복횟수 : 1부터 num까지 1씩증가 (반복횟수면에서는 규칙성이 없어서)
		 * 규칙성 : i가 num의 약수이면 i를 출력
		 *         => num을 i로 나누었을 때 나머지가 0과 같다면 i를 출력.
		 * */
		
		
		int num, i; //i를 초기화 필요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("intput positive number : ");
		num = sc.nextInt();

		i = 1;
		while (i <= num) {
			if(num % i == 0) {
			System.out.println(i);
			}
			++i;
		
		}
		
		sc.close();
	}

}
