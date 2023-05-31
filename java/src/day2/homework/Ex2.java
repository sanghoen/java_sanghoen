package day2.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요.");
		
		String str = "";
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		char Plus = '+';
		str = "" + num1 + Plus + num2 + "=" + (num1+num2);
		System.out.println(str);
		
		char Subtract = '-';
		str = "" + num1 + Subtract + num2 + "=" + (num1-num2);
		System.out.println(str);
	
		char multiply = '*';
		str = "" + num1 + multiply + num2 + "=" + (num1*num2);
		System.out.println(str);
		
		char divide = '/';
		double num3 = (double) num1/num2;
		str = "" + num1 + divide + num2 + "=" + (num3);
		System.out.println(str);
		
		char remain = '%';
		str = "" + num1 + remain + num2 + "=" + (num1%num2);
		System.out.println(str);
		
		sc.close();
	}

}
