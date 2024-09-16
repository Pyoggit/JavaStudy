package kr.co.pyoedu;

public class SpecTest {
	public static void main(String[] args) {
		
		Spec spec = new Spec();
		
		spec.setName("장표");
		spec.setAge(26);
		spec.setNum(18100171);
		spec.setMajor("정보통신공학과");
		
		System.out.println("이름: "  + spec.getName(null)+"");
		System.out.println("나이: " + spec.getAge(0)+ "");
		System.out.println("학번: " + spec.getNum(0)+ "");
		System.out.println("학과: " + spec.getMajor(null)+ "");
	}

}
