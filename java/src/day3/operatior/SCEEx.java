package day3.operatior;

public class SCEEx {

	public static void main(String[] args) {

		String str = null;
		//str이 null이기 때문에 str.xx로 되어 있는 모든 곳에서 에러가 발생.
		//그런데 && 연산자 앞에서 null체크하는 코드가 먼저 있기 때문에 null인 경우에
		//앞 부분이 거짓이 되서, 뒷부분이 문제가 되는 코드를 실행하지 않아서 무사히 넘어감(SCE)
		System.out.println("is " + str + " equal to abc? "
		        + (str != null && str.equals("abc")));
		//아래 코드는 위 코드에서 순서만 변경한 코드로,
		//문제가 되는 코드를 먼저 실행하기 때문에 에러(예외)가 발생한다
		/*System.out.println("is " + str + " equal to abc? "
		        + (str.equals("abc") && str != null));
		*/
	}

}
