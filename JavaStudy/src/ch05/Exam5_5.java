package ch05;

public class Exam5_5 {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } 
			};

		int sum = 0;
		double avg = 0.0;

		// �ڵ� �ۼ�
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		avg = (double)(sum) / 10;

		System.out.println("�� : " + sum);
		System.out.println("��� : " + avg);
	}

}
