package ch04;

public class Exam04_02 {
	public static void main(String[] args) {
		int score = 13;
		// �ڵ� �ۼ�
		if(score % 2 == 0 && score % 3 == 0) // score % 6 == 0
			System.out.println("��¦");
		else if (score % 2 == 0 )
			System.out.println("¦");
		else if (score % 3 == 0)
			System.out.println("��");
		else
			System.out.println(score);
	}

}
