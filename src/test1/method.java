package test1;

public class method {
	public static String 메소드(int init, int limit) {
		int i = init;
		String box = "";
		while (i < limit) {
			box += i;
			i++;
		}
		return box;
	}

	
	public static void main(String[] args) {
		String result = 메소드(43,55);
		System.out.println(result);
	}
}

// 자바도 파이썬처럼 메소드이름 한글 가능 클래스도 가능