package ch01;

public class Test {
	public static void main(String[] args) {
		// Unix Time
		System.out.println(System.currentTimeMillis());
		// Random 0.0 <= X < 1.0
		System.out.println( Math.random());
		
		// 0.0 <= X < 6
		System.out.println( Math.random() * 6);
		
		// 0~5 Á¤¼öÇü
		System.out.println( (int)(Math.random() * 6) );
		
		// 1~6
		System.out.println( (int)(Math.random() * 6) + 1);
	}

}
