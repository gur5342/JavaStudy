package ch15;

public class ExceptionExam1 {
	public static void main(String[] args) {
		String numStr = "123";
		try {
			int num = Integer.parseInt(numStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 

		try {
		Object obj = new String("a");
		int a = (Integer) obj; // ClassCastException
		} catch(ClassCastException e) {
			System.out.println("���� �߻�");
		}
	}

}
