package ch07;

public class Member {
	String id;
	String password;
	String name;
	int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) { // 유효성 검사, -> 캡슐화
		if(a < 0 || a > 200) {
			System.out.println("잘못된 나이입니다.");
			return;
		}
	}
	public void setId(String i) {
		id = i;
	}
*/
}
