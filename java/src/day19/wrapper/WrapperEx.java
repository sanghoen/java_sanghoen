package day19.wrapper;

public class WrapperEx {

	public static void main(String[] args) {

		Integer num1 = 10;//박싱 : 정수 10을 Integer 클래스의 격채 num1에 저장
		//num1 = null;
		int num2 = 0;
		if (num1 != null){
			num2 = num1;// 언박싱 : Integer 클래스 객체 num1에 있는 값을 num2에 저장. 예외 처리 필요
		}
		System.out.println(num1);
		System.out.println(num2);
		
		//ArrayList<integer> list;
		
		//Integer.paraInt와 같이 문자열을 기본자료형으로 변환하는 메서드를 사용할 때
		//예외처리 해주는 것이 좋다.
		int num3 = Integer.parseInt("123");
		System.out.println(num3);
	}

}
