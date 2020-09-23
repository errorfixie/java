package test1;

public class method3 {
	public static String[] getMembers() {
		String[] members = {"나", "너"," 우리"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] m = getMembers();
		System.out.println(m[0]);
		System.out.println(getMembers());
	}
}

// 반환,호출은 파이썬과 동일
// 값을 반환하는것과 화면에 출력되는것은 다르다
