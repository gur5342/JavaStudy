package ch04;

public class ifExam2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a++ == 10 && a == 11) { // ���� ��� a = 10, ���� �� ++�� ����
			System.out.println("1��");
		} // ��� ���迡 ���� ���� �ڵ�

		System.out.println("a : " + a);

		if (--a == 10 || ++b == 21) { // --a�� ���̱� ������ �ڿ� b�� ������ �ʰ� ����
			System.out.println("2��");
		}

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
