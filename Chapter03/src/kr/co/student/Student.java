package kr.co.student;

public class Student {
	private String name;
	private int num;
	private double korean;
	private double english;
	private double math;

	public Student(String name, int num, double korean, double english, double math) {
		this.name = name;
		this.num = num;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public double getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getTotalScore() {
		return korean + english + math;
	}

	public double getAverageScore() {
		return getTotalScore() / 3.0;
	}

	@Override
	public String toString() {
		return "학생번호: " + num + ", 이름: " + name + ", 총점: " + getTotalScore() + ", 평균: " + getAverageScore();
	}

}
