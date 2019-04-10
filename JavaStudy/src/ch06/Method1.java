package ch06;

public class Method1 {
	public static void sum(int a, char c) {
		System.out.println(2);
		char trans = (char)(c + a); // 강제 형 변환 
		System.out.println(trans);
	} // 아스키 코드 증가 하는 함수
	
	public static void main(String[] args) {
		System.out.println(1);
		sum(2 , 'A');
		System.out.println(3);
	}

}
