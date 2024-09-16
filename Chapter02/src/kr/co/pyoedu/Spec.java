package kr.co.pyoedu;

public class Spec {
	
	//변수
	private String name,major;
	private int age,num;
	
	public Spec(String name, String major, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;
		this.major = major;
	}
	public Spec() {
		
	}
	//생성자
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(int age) {
		return this.age;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum(int num) {
		return this.num;
	}
	public void setMajor(String major) {
		this.major = major ;
	}
	public String getMajor(String major) {
		return this.major;
	}
	//함수
	
}
