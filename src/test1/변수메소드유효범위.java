package test1;

class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v);
	}
}

public class 변수메소드유효범위 {
	public static void main(String[] args) {
		C3 c = new C3();
		c.m();
		
				
	}
	
}
