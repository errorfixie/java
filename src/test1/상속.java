package test1;

class Calculator2 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum(int left, int right) {
		System.out.println(left + right);
		System.out.println(this.left + this.right);
	}
	
	public void sum2() {
		System.out.println(left + right);
		System.out.println(this.left + this.right);
	}
}

public class »ó¼Ó {
	public static void main(String[] args) {
		Calculator2 a = new Calculator2();
		
		
		a.setOprands(10,20);
		int left, right;
		left = 50; right = 60;
		a.sum(40,50);
		a.sum2();
		System.out.println(a.left + left);
	}
	
}

// this.left