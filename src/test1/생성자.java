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

public class ������ {
	public static void main(String[] args) {
		Calculator C = new Calculator(10,20);
		C.sum();
		C.avg();
//		System.out.println(C.left);
	}
	
}

// public : ���� ���� x
// default(�ƹ��͵� �Ⱦ���) : ���� ��Ű�� �ȿ����� ���� o
// private : �ڱ� Ŭ���� �������� ���� o