package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		boolean isContinue = true;

		Scanner scan = new Scanner(System.in);

		while (isContinue) {
			System.out.println("가위:0, 바위:1, 보:2");
			System.out.print("숫자 입력 > ");
			
			int player = scan.nextInt();
			int com = (int) (Math.random() * 3); // 0 ~ 2까지 
			
			System.out.println(player + "/" + com);
			
			if (player == com) {
				System.out.println("비김");
			} else {
				if ((player + 1) % 3 == com) {
					System.out.println("짐");
				} else {
					System.out.println("이김");
					isContinue = false;
				}
			}
		}
		scan.close();
	}

}
