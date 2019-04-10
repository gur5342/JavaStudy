package ch06;

public class Exam6_2 {
	public static void main(String[] args) {
		 int n = 100;
		 int total = MakeSum(1, n);
		 System.out.println("1 ~ " + n + " 까지의 합 : " + total);
		 }

	// 메소드 작성
	public static int MakeSum(int a, int b) { // void를 사용하면 메소드를 호출할 수 없다.
		
		int sum = 0;
		for(int i = a ; i <= b; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
