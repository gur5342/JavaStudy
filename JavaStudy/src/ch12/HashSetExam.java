package ch12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExam {

public static void main(String[] args) {
		
		//HashSet<Integer> lotto = new HashSet<Integer>(); // 중복값을 걸러내는 상황일 때 사용
		TreeSet<Integer> lotto = new TreeSet<Integer>(); // 정렬할 때 사용
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
