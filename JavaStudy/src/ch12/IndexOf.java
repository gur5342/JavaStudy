package ch12;

public class IndexOf {
	public static void main(String args[]) {
		//            0123456 789
		String str = " Java ������ �缺�� ���� ����������!!";
		int idx = -1;
		
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) {
				break;
			}
			System.out.println(idx);
		}
		/*
		int idx2 = str.lastIndexOf(" ");
		System.out.println(idx2);

		idx = str.indexOf(" ", idx + 1); // '��' ���� ���� ã�� ���� idx + 1�� �Է� 
		System.out.println(idx);

		idx2 = str.lastIndexOf(" ", idx2 - 1);
		System.out.println(idx2);
		*/
	}

}
