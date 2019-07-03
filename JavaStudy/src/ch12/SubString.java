package ch12;

public class SubString {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		/*
		String str1 = str.substring(5); // 6번부터 출력
		System.out.println(str1);

		String str2 = str.substring(0, 6); // 0~6 까지
		System.out.println(str2);

		String str3 = str.substring(12, 15);
		System.out.println(str3);
		*/
		int idx = 0;
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) {
				//System.out.println(str); // 있고 없고의 차이점을 확인할 것
				break;
			}
			System.out.println(str.substring(0, idx));
		}
	}

}
