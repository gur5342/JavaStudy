package ch04;

public class Exam4_8 { // 입사 문제로 자주 나온다.
	public static void main(String[] args) {
		
		for (int i = 1; i <= 1000; i++) {
			// 코드 작성
			int n = i;
			while(n > 0) {
				int n2 = n % 10;
				if( n2 == 3) {
					System.out.println(n);
					break;
				}
				n = n / 10;
			}

			/* 내가 한 것  
			 * if (i % 10 == 3 || i / 100 == 3 || i % 100 / 10 == 3) System.out.println(i +
			 * " : 3 포함");
			 */
		}
	}

}
