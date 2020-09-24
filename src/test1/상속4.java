package test1;

class Calculator7 {
	int left, right;
	
	public Calculator7() {}
	
	public Calculator7(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}
}

class a2 extends Calculator7 {
	public a2(int left, int right) {
//		super(left, right);
		this.left = left;
		this.right = right;
	}
}

public class »ó¼Ó4 {
	public static void main(String[] args) {
		a2 c = new a2(10,20);
		c.sum();
	}
}
