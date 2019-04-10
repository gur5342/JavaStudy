package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;

		int len = id.length();
		for (int i = 0; i < len; i++) {
			char ch = id.charAt(i);
			if (ch >= ASCII_A && ch <= ASCII_Z) {
				isUpper = true;
			} else if (ch >= ASCII_a && ch <= ASCII_z) {
				isLower = true;
			}

		}
		if (isUpper && isLower) {
			System.out.println("입력하신 아이디는" + "입니다.");
			System.out.println("정상 가입 되었습니다.");
		}

		else {
			System.out.println("아이디를 확인해주세요.");
		}
		s.close();
	}
}
