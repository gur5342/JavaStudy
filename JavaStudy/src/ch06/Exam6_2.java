package ch06;

public class Exam6_2 {
	public static void main(String[] args) {
		 int n = 100;
		 int total = MakeSum(1, n);
		 System.out.println("1 ~ " + n + " ������ �� : " + total);
		 }

	// �޼ҵ� �ۼ�
	public static int MakeSum(int a, int b) { // void�� ����ϸ� �޼ҵ带 ȣ���� �� ����.
		
		int sum = 0;
		for(int i = a ; i <= b; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
