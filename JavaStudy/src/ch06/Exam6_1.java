package ch06;

public class Exam6_1 {
	public static void main(String[] args) {
		int result1 = plus(5, 3);
		System.out.println("plus => " + result1);

		int result2 = minus(5, 3);
		System.out.println("minus => " + result2);
	}

	public static int plus(int num1, int num2) {
		// �ڵ� �ۼ�
		int num3;		
		num3 = num1 + num2;	
		return num3; // �Ǵ� ������ ������ ���� 'return num1 + num2;' �� �ص� �ȴ�.
		
	}

	public static int minus(int num1, int num2) {
		// �ڵ� �ۼ�
		int num4;
		num4 = num1 - num2;
		return num4;
	}

}
