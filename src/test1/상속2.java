package test1;

class Calculator3 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
}

class SubstrictionableCalculator extends Calculator3 {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class Multi extends SubstrictionableCalculator{
	public void multiply() {
		System.out.println(left * right);
	}
}


public class ���2 {
	public static void main(String[] args) {
		SubstrictionableCalculator a = new SubstrictionableCalculator();
		a.setOprands(50,30);
		a.sum();
		a.substract();
		
		Multi b = new Multi();
//		b.setOprands(10, 30);
		b.multiply(); // ��� 0 
		System.out.println(b.left); // ��� 0 
	}

}

//��������� �ʱ�ȭ���� �ʾƵ� Ÿ�Կ� �´� �⺻���� �ش�. ex) int�� ��� 0
// ������ ���������� �ݵ�� �ʱ�ȭ�� ������Ѵ�.
// �ʱ�ȭ��) ���� ���� �� ���� �������ִ°�
