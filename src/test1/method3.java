package test1;

public class method3 {
	public static String[] getMembers() {
		String[] members = {"��", "��"," �츮"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] m = getMembers();
		System.out.println(m[0]);
		System.out.println(getMembers());
	}
}

// ��ȯ,ȣ���� ���̽�� ����
// ���� ��ȯ�ϴ°Ͱ� ȭ�鿡 ��µǴ°��� �ٸ���
