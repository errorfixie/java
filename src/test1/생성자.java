package test1;

class Calculator {
	private int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

public class 생성자 {
	public static void main(String[] args) {
		Calculator C = new Calculator(10,20);
		C.sum();
		C.avg();
//		System.out.println(C.left);
	}
	
}

// public : 접근 제한 x
// default(아무것도 안쓸때) : 같은 패키지 안에서만 접근 o
// private : 자기 클래스 내에서만 접근 o