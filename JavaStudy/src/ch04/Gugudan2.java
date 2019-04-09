package ch04;

public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t"); 
			} // j를 먼저 출력함으로서 세로로 출력하는 코드
			System.out.println();
		}
	}

}
