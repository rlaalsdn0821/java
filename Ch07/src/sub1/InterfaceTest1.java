package sub1;

/*
* ��¥: 2021/05/25
* �̸�: ��ο�
* ����: �ڹ� �������̽� �ǽ��ϱ�
*/

public class InterfaceTest1 {
	
	public static void main(String[] args) {
		// �������̽� - Ŭ���� ������ ǥ�� ���̵� ����.
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}

}
