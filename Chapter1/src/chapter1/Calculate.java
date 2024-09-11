package chapter1;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		//0.입력 객체(객체참조변수)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요[* / % + -]: ");
		char operator = sc.next().charAt(0);
		
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		//1.변수 상수 선언
		int result;
		//2.계산처리
		if (operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			if(num2 != 0) {
			result = num1 / num2;
			}else {
				System.out.println("오류: 0으로 나눌 수 없습니다.");
				sc.close();
				return;
			}
			
		}else {
			System.out.println("오류: 잘못된 연산자입니다.");
			sc.close();
			return;
		}
		//3.출력
		System.out.printf("결과: %d %c %d = %d\n", num1, operator, num2, result);
		//4.종료
		sc.close();		
	}

}
