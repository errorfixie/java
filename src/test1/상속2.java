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


public class 상속2 {
	public static void main(String[] args) {
		SubstrictionableCalculator a = new SubstrictionableCalculator();
		a.setOprands(50,30);
		a.sum();
		a.substract();
		
		Multi b = new Multi();
//		b.setOprands(10, 30);
		b.multiply(); // 출력 0 
		System.out.println(b.left); // 출력 0 
	}

}

//멤버변수는 초기화하지 않아도 타입에 맞는 기본값을 준다. ex) int의 경우 0
// 하지만 지역변수는 반드시 초기화를 해줘야한다.
// 초기화란) 변수 선언 후 값을 지정해주는것
