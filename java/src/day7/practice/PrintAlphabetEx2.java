package day7.practice;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {

		/* a
		 * ab
		 * abc
		 * abcd
		 * ..
		 * abcdef...xyz
		 * */
		char ch = 'a' , end;
		
		/* 외부 반복문 
		 * 반복횟수 : end는 'a'부터 시작해서 'z'까지 1씩 증가
		 * 규칙성 : 'a'부터 end까지 출력
		 * 반복문 종료후 : 없음
		 * */
		for(end = 'a'; end <= 'z'; end++) {
		
			/* 내부 반복문 
			 * 반복횟수 : ch는 'a'부터 시작해서 end까지 1씩 증가
			 * 규칙성 : ch를 출력
			 * 반복문 종료후 : 없음
			 * */
			for(ch = 'a'; ch <= end; ch++) {
				System.out.print(ch);
			}
			System.out.println();
				
			
		}
	}

}
