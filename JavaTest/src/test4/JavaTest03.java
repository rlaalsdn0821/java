package test4;

/*
 * ��¥ : 2021/05/27
 * �̸� : ��ο�
 * ���� : String Ŭ���� ��������
 */

public class JavaTest03 {
	
	public static void main(String[] args) {

		String fileName = "�ڹ� ������.hwp";

		int idx = fileName.lastIndexOf(".");

		String title = fileName.substring(0, idx);
		String ext   = fileName.substring(idx+1);

		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
	}	

}