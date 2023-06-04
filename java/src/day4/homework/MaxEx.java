package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {

		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two integers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a);
		} else if (a<b) {
			System.out.println(b);
		} else {
			System.out.println("a and b are the same");
		}
		
		sc.close();
	}

}
