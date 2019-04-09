package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		// 코드 작성 (% 연산자)
		/*
		int num1 = num % 10; // num / 10000;
		int num2 = num / 10 % 10;
		//(num % 10000) / 1000;
		int num3 = num / 100 % 10;//(num % 10000 % 1000) / 100;
		int num4 = num / 1000 % 10;//(num % 10000 % 1000 % 100) / 10;
		int num5 = num / 10000 % 10;//(num % 10000 % 1000 % 100 % 10);
*/
		int num1 = num % 10;
		num = num /10;
		
		int num2 = num % 10;
		num = num /10;
		
		int num3 = num % 10;
		num = num /10;
		
		int num4 = num % 10;
		num = num /10;
		
		int num5 = num % 10;
		num = num /10;
		// 너무 지저분, 다시 해볼 것
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);

	}

}
