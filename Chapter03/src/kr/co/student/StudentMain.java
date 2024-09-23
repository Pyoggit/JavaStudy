package kr.co.student;

import java.util.Scanner;

public class StudentMain {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean exitFlag = false;
		
		Student[] st = new Student[10];
		
		for(;!exitFlag;) {
			dispMenu();
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				insertStudent(st);
				break;
			case 2 :
				findStudent(st);
				break;
			case 3 :
				printStudent(st);
				break;
			case 4 :
				exitFlag = true;
				System.out.println("종료");
				break;
			}
		}
		System.out.println("The end");

	}
	public static void dispMenu() {
		System.out.println("+++++++++++++++++++++");
		System.out.println("1.학생정보입력");
		System.out.println("2.학생정보검색");
		System.out.println("3.학생정보출력");
		System.out.println("4.종료");
		System.out.println("+++++++++++++++++++++");
		System.out.print("번호를 입력하세요: ");
	}
	public static void insertStudent(Student[] st) {
		System.out.print("학생번호 입력: ");
		int num = sc.nextInt();
		System.out.print("학생이름 입력: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("국어점수 입력: ");
		double korean = sc.nextInt();
		System.out.print("영어점수 입력: ");
		double english = sc.nextInt();
		System.out.print("수학점수 입력: ");
		double math = sc.nextInt();
		Student st1 = new Student(name,num,korean,english,math);//
		st[num - 1] = st1;//
	}
	public static void findStudent(Student[] st) {
		boolean findFlag = false;
		System.out.print("학생이름검색: ");
		sc.nextLine();
		String name = sc.nextLine();
		for(int i = 0; i<st.length; i++) {
			if(st[i] != null && st[i].getName().equals(name)) {
				System.out.println("학생정보: " + st[i].toString());
				findFlag = true;
				break;
			}
		}
		if(findFlag == false) {
			System.out.println("학생 정보를 찾을 수 없습니다.");
		}
	}
	public static void printStudent(Student[] st) {
		for(int i = 0; i<st.length; i++) {
			if(st[i]==null) {
				continue;
			}
			System.out.println(st[i].toString());
		}
	}

}
