package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
		// shift + alt + r : ������ �ϰ�����
		int leftspace = 5 / 2; // 2
		int rightspace = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				
				if (leftspace >= j || rightspace <= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if( i > (5 / 2)) { // �߽��� �ʰ�
				leftspace = leftspace + 1 ;
				rightspace = rightspace - 1 ;
			}
			else {
				leftspace = leftspace - 1;
				rightspace = rightspace + 1 ;
			}
			System.out.println();
		}
	}

}
