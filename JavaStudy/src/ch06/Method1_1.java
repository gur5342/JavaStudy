package ch06;

public class Method1_1 {
	public static char sum(int a, char c) {
		
		char trans = (char)(c + a); // 강제 형 변환 
		return trans;
	} // 아스키 코드 증가 하는 함수
	
	public static void main(String[] args) {
		
		char ch = sum(2 , 'A');
		System.out.println(ch);
	}


}
