package ch04;

public class ifExam2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a++ == 10 && a == 11) { // 동작 당시 a = 10, 실행 후 ++가 동작
			System.out.println("1번");
		} // 취업 시험에 나올 만한 코드

		System.out.println("a : " + a);

		if (--a == 10 || ++b == 21) { // --a가 참이기 때문에 뒤에 b를 보이지 않고 실행
			System.out.println("2번");
		}

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
