package ch06;

public class Method1_1 {
	public static char sum(int a, char c) {
		
		char trans = (char)(c + a); // ���� �� ��ȯ 
		return trans;
	} // �ƽ�Ű �ڵ� ���� �ϴ� �Լ�
	
	public static void main(String[] args) {
		
		char ch = sum(2 , 'A');
		System.out.println(ch);
	}


}
