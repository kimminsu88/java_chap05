package java_chap05;

public class ReferenceTypeEx {

	public static void main(String[] args) {
		byte bValue = 25;
		short sValue = 25;
		
		if (bValue == sValue) {
	         System.out.println("bValue�� ���� sValue�� ���� �����ϴ�.");
		}
		else {
			 System.out.println("bValue�� ���� sValue�� ���� �ٸ��ϴ�.");
		}
		
		String str1 = "����Ÿ��";// new Ű���带 ����ؼ� ���� ������ �������� �����͸� �߰�
		String str2 = "����Ÿ��";// str1�� ����Ǹ鼭 ������ �������� �ּҸ� ������ 
		
		if (str1 == str2) {
			 System.out.println("str1�� ���� str2�� ���� �����ϴ�.");
		}
		else {
		     System.out.println("str1�� ���� str2�� ���� �ٸ��ϴ�.");
		}
//		String ������ Ÿ���� ���� Ÿ��
//		���� Ÿ���� ���� �ʱ�ȭ �� new Ű���带 �ݵ�� ����ؾ� ��
//		String ������ Ÿ���� �⺻ Ÿ��ó�� ����ϴ� ������ Ÿ���̹Ƿ� ���ܸ� �ּ� �⺻ Ÿ��ó��
//		new Ű���� ���̵� ����� �� �ֵ��� ��
//		String Ÿ���� ���� 2�� �̻��� ������ �ڵ� �� ������ �����ϰ� ������ �����͸� new Ű������� ���Կ����ڸ� ����Ͽ�
//		�����Ͽ��� ��� ���� ����� String Ÿ���� �������� new Ű���尡 ���ǰ�, ���߿� ����� String Ÿ���� �������� ������ ����� String Ÿ���� ������
//		�������ִ� �޸��ּҸ� ������
//		String ������ Ÿ���� Ŭ������ ������� ����
//		String ������ Ÿ���� Ŭ������ ������� �ֱ� ������ �������� �޼��尡 ������
		String str3 = "����Ÿ��";
		String str4 = new String("����Ÿ��");
	
		if (str3 == str4) {
			 System.out.println("str3�� ���� str4�� ���� �����ϴ�.");
		}
		else {
		     System.out.println("str3�� ���� str4�� ���� �ٸ��ϴ�.");
		}
		if (str3.equals(str4)) {
			 System.out.println("str3�� ���� str4�� ���� �����ϴ�.");
		}
		else {
		     System.out.println("str3�� ���� str4�� ���� �ٸ��ϴ�.");
		}
	}
}
