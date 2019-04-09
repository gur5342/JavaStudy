package ch04;

public class ForExam3 { // 홀수의 합을 구하는 for문
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i = i + 2) {
			sum = sum + i;
			System.out.print("i의 값 => " + i);
			System.out.println(" sum의 값 => " + sum);
		}
	}

}
