package day7.method;

public class MethodEx {

	public static void main(String[] args) {

		/* 두 정수의 합을 구하는 함수(메서드)를 만드세요.
		 * 
		 */
		int num1 = 1, num2 = 2;
		int res = sum(num1, num2); //매개변수의 갯수에 맞게 호출 
		System.out.println(res);   //매개변수는 값을 복사하여 전달함, 직접 전달하는 것이 아님.
	}						
	/**
	 * 기능 	 : 두 정수가 주어지면, 두 정수의 합을 알려주는 매서드
	 * 매서드명 : sum
	 * 리턴타입 : 두 정수의 합 => int
	 * 매개변수 : 두 정수 => int num1, int num2
	 * @return
	 * */
	/**
	 * 기능 	 : 두 정수가 주어지면, 두 정수의 합을 알려주는 매서드
	 * @param num1 정수1
	 * @param num2 정수2
	 * @return 두 정수의 합  
	 */
	//위 설명들에 해당하는 함수에 마우스를 가져가면 해당 설명을 볼 수 있다.
	public static int /*리턴타입*/sum(int num1, int num2) /*매서드명, 함수(매개변수들)*/ {
		int res = num1 + num2;
		return res;
	   //return = num1 + num2; 
	}
	
}


