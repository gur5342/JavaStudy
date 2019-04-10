package ch06;

public class Exam6_1 {
	public static void main(String[] args) {
		int result1 = plus(5, 3);
		System.out.println("plus => " + result1);

		int result2 = minus(5, 3);
		System.out.println("minus => " + result2);
	}

	public static int plus(int num1, int num2) {
		// 코드 작성
		int num3;		
		num3 = num1 + num2;	
		return num3; // 또는 변수를 만들지 말고 'return num1 + num2;' 를 해도 된다.
		
	}

	public static int minus(int num1, int num2) {
		// 코드 작성
		int num4;
		num4 = num1 - num2;
		return num4;
	}

}
