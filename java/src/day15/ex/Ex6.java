package day15.ex;

public class Ex6 {

	public static void main(String[] args) {

		/*
		 * 다음 코드에서 잘못된 내용을 수정하세요.
			class A{
				int num;	
				public A(int num){
					num = num;
				}
			}
			//main메서드
			A a = new A();
		 */
		
		class A{
			int num;	
			public A(int num){
				this.num = num;
			}
			public A(){}
		}
		//main메서드
		A a = new A();

	}

}
