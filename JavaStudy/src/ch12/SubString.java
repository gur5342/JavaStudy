package ch12;

public class SubString {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		/*
		String str1 = str.substring(5); // 6������ ���
		System.out.println(str1);

		String str2 = str.substring(0, 6); // 0~6 ����
		System.out.println(str2);

		String str3 = str.substring(12, 15);
		System.out.println(str3);
		*/
		int idx = 0;
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) {
				//System.out.println(str); // �ְ� ������ �������� Ȯ���� ��
				break;
			}
			System.out.println(str.substring(0, idx));
		}
	}

}
