package test1;

public class method {
	public static String �޼ҵ�(int init, int limit) {
		int i = init;
		String box = "";
		while (i < limit) {
			box += i;
			i++;
		}
		return box;
	}

	
	public static void main(String[] args) {
		String result = �޼ҵ�(43,55);
		System.out.println(result);
	}
}

// �ڹٵ� ���̽�ó�� �޼ҵ��̸� �ѱ� ���� Ŭ������ ����