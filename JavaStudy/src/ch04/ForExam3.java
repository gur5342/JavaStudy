package ch04;

public class ForExam3 { // Ȧ���� ���� ���ϴ� for��
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i = i + 2) {
			sum = sum + i;
			System.out.print("i�� �� => " + i);
			System.out.println(" sum�� �� => " + sum);
		}
	}

}
