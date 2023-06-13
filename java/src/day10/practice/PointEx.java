package day10.practice;

public class PointEx {

	public static void main(String[] args) {
		/* 좌표의 점을 관리하는 클래스를 만들고 테스트하는 코드를 작성하세요.
		 * */
		Point pt1 = new Point();
		pt1.print();
		pt1.move(10, 20);
		pt1.print();
		
		Point pt2 = new Point(30, 40);
		pt2.print();
		
	}

}
// 점을 관리하는 클래스
/* 클래스의 접근제어자가 public으로 올 수 있는 조건
 * - 파일명과 클래스명이 같아야 public을 붙일 수 있다.
 * 같은 패키지에 같은 이름의 클래스가 있으면 안된다.
 * */
class Point{
	//멤버변수
	/* x좌표, y좌표 */
	private int x, y;
	//생성자 - 생성자 앞에는 거의 다 public. private가 오는 경우가 드물다.
	public Point() {}
	//생성자 오버로딩. x, y좌표가 주어졌을 때 객체를 초기화
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//getter와 setter(메서드에 포함)
	
	/* getter
	 *  public 리턴타입 get변수명() {
	 * 		return 변수명;
	 * }
	 * get변수명에서 변수명의 첫 글자를 대문자
	 * 리턴타입은 변수의 자료형
	 * 
	 * setter
	 * public void set변수명(자료형 변수명){
	 * 		this.변수명 = 변수명;
	 * */

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메서드
	/** 현재 좌표를 출력하는 기능
	 * 	매개변수 : 없음 - 기능을 구현 하는데 내 정보를 활용한 것이 아니라, 남이 알려줘야 하면 매개변수 필요.
	 *  리턴타입 : 없음 => void - 출력하고 끝나면 돼서. 
	 *  메서드명 : print
	 * */
	public void print ( ) {
		System.out.println("" + x + "," + y + "px");
	}
	/** 주어진 x, y 좌표로 이동하는 메서드
	 *   => 멤버변수 x, y를 주어진 x, y로 수정하는 메서드
	 *  매개변수 : 주어진 x, y => int x, int y
	 *  리턴타입 : 없음 => void
	 *  메서드명 : move
	 * */
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}




