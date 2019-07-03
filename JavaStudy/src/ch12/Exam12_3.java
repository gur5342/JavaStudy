package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		// 코드 작성
		int idx = 0;
		while (true) {
			idx = str.indexOf(" ", idx + 1);
			if (idx == -1) {
				System.out.println(str); // -1 을 만나면 '만세'를 출력할 수 있게 한다. 
				break;
			}
			System.out.println(str.substring(0, idx)); 

		}
	}

}
