package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length; i++) {
			// 코드 작성
			char temp = ' '; // 바꿀 공간을 만든다.
			int random = (int)(Math.random() * 7);
			temp = nums[0];
			nums[0] = nums[random];
			nums[random] = temp;
		}

		System.out.println(nums);
	}

}
