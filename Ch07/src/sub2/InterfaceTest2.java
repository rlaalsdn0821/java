package sub2;

/*
* ��¥: 2021/05/25
* �̸�: ��ο�
* ����: �ڹ� �������̽� �ǽ��ϱ�
*/

public class InterfaceTest2 {
	
	public static void main(String[] args) {
		// �������̽� - ���߻�� ȿ��.
		SmartTv stv = new SmartTv();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}

}
