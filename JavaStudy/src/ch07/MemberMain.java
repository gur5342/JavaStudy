package ch07;

public class MemberMain {
	int age;
	
	void method() {
		age = age + 1;
		int age2 = 0;
		age2 = age2 + 1;
	}
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "ggoreb";
		System.out.println(m1);
	}

}
