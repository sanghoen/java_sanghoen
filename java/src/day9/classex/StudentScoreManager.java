package day9.classex;

import java.util.Scanner;

public class StudentScoreManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		//korScore는 인스턴스, 객체
		//Score1 korScore = new Score1(1, 2, "korean Language");
		Score1 korScore = new Score1();
		korScore.title = "korean Language";
		korScore.grade = 1;
		korScore.semester = 2;
		Score1 engScore = new Score1(1, 2, "English");
		System.out.println(engScore.title);
	}

}
//성적 클래스
class Score1{
	public Score1(String title, int grade, int semester, double total, double mid, double finalExam,
			double performance) {
		super();
		this.title = title;
		this.grade = grade;
		this.semester = semester;
		this.total = total;
		this.mid = mid;
		this.finalExam = finalExam;
		this.performance = performance;
	}
	String title;//과목명
	int grade;//학년
	int semester;//학기
	double total;//총점수
	double mid;//중간고사
	double finalExam;//기말고사
	double performance;//수행평가
	//Score1 클래스의 기본생성자
	public Score1() {
		/* title의 기본값은? null
		 * grade의 기본값은? 0
		 * total의 기본값은? 0.0
		 */
		title = "";
		grade = 1;
		semester = 1;
	}
	public Score1(int _grade, int _semester, String _title) {
		grade = _grade;
		semester = _semester;
		title = _title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getMid() {
		return mid;
	}
	public void setMid(double mid) {
		this.mid = mid;
	}
	public double getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}
	public double getPerformance() {
		return performance;
	}
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	
}
//학생 클래스
class Student1{
	String name;//이름
	String residentNumber;//주민번호(O)
	int grade;//학년
	int classNum;//반
	int number;//번호
	int admissionYear;//입학년도
	Score1 korScore, engScore, mathScore;//국어, 영어, 수학 성적
}





