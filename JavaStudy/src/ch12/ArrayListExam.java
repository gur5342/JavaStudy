package ch12;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		while(true) {
			int num = (int)(Math.random() * 46) + 1;
			lotto.add(num);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		/*
		for(int i = 0; i < 6 ; i++) {
			
		}
		*/ // while문과 동일한 내용
		
		
		
		String[] arr = new String[3];
		arr[0]	= "kim";
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // 정수를 담을 때는 Integer를 사용해야한다.
		// int를 사용하면 오류가 발생
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		String value2 = list.get(0);
	}

}
