package day2.variable;

public class StringEx {

	public static void main(String[] args) {

		/* string 클래스는 문자열을 수정하는 게 아니라 새로 생성하는 것 */
		String str1 = null;
		String str2 = "";
		String str3 = "A"; // char ch = 'A';와 다름. 문자열과 문자의 차이.
		String str4 = "안녕하세요.";
		System.out.println(str1);//null이라는 문자열이 아님.
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
