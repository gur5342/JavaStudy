package ch12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExam {

public static void main(String[] args) {
		
		//HashSet<Integer> lotto = new HashSet<Integer>(); // �ߺ����� �ɷ����� ��Ȳ�� �� ���
		TreeSet<Integer> lotto = new TreeSet<Integer>(); // ������ �� ���
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
		*/ // while���� ������ ����
		
		
		
		String[] arr = new String[3];
		arr[0]	= "kim";
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // ������ ���� ���� Integer�� ����ؾ��Ѵ�.
		// int�� ����ϸ� ������ �߻�
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		String value2 = list.get(0);
	}

}
