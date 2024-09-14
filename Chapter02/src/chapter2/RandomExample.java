package chapter2;

//math.random()*(큰값 - 작은 값 + 1)+ 작은 값; 사용하여 로또프로그램 예제
//1~45까지 추출

public class RandomExample {
	public static void main(String[] args) {
		System.out.print("당첨번호는: ");
		for (int j = 1; j <= 6; j++) {
			int lotto = (int) (Math.random() * (45) + 1);
			
			System.out.print(lotto + " ");
		}
		int bonusNum = (int) (Math.random() * (45) + 1);
		System.out.print("+ " + bonusNum + " 입니다. 축하드립니다!!");

	}

}
