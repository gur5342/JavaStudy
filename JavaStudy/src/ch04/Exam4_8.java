package ch04;

public class Exam4_8 { // �Ի� ������ ���� ���´�.
	public static void main(String[] args) {
		
		for (int i = 1; i <= 1000; i++) {
			// �ڵ� �ۼ�
			int n = i;
			while(n > 0) {
				int n2 = n % 10;
				if( n2 == 3) {
					System.out.println(n);
					break;
				}
				n = n / 10;
			}

			/* ���� �� ��  
			 * if (i % 10 == 3 || i / 100 == 3 || i % 100 / 10 == 3) System.out.println(i +
			 * " : 3 ����");
			 */
		}
	}

}
