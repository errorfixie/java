package test1;

class Cal{
	int[] oprands;
	
	public Cal(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum() {
		int total = 0;
		for (int a : this.oprands) {
			total += a;
		}
		System.out.println(total);
	}
	public void a(String a) {
		System.out.println(a+"�θ�");
	}
}

class Cal2 extends Cal {
//	String hello;
	public Cal2(int[] oprands) {
		super(oprands);
	}
	
	public void a(int a) {
		System.out.println(a + "�ڽ�");
	}
	
	public void sum() {
		System.out.println("aaa");
		super.sum();
		System.out.println("aaa");
	}
}
	
	
public class �����ε� {
	public static void main(String[] args) {
		int[] b = {1,2,3,4,5};
		Cal2 a = new Cal2(b);
		a.sum();
		a.a("�ȳ�");
		a.a(5);
	}
}

// �����ε�, �������̵�, ��� ���� �ȱ�.. �Ϸ�