package chapter2;

import java.util.Scanner;

//1~100 까지 정수 중 알아 맞추는 게임 만들기
//무한루프(for문)사용,Random 함수 사용,삼항연산자 ()?():() 사용하여 가독성 높이기

public class ForExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer =(int)(Math.random()*(100)+1);
		int count = 0, userGuess = 0;
		for(;true;) {
			System.out.print("숫자를 맞춰보세요: ");
			userGuess = sc.nextInt();
			count ++;
			
			if(userGuess ==  answer) {
				System.out.println("정답입니다! " + "시도횟수: "  + count);
				break;
			}
			System.out.println((userGuess > answer)?("정답보다 높습니다."):("정답보다 낮습니다."));
		}
		System.out.println("The End");
	}

}
