package sub3;

/*
* ��¥: 2021/05/25
* �̸�: ��ο�
* ����: �ڹ� �������̽� �ǽ��ϱ�
*/

public class Interface3 {
	
	public static void main(String[] args) {
		// �������̽� - ��ü�� ���յ� ��ȭ.
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}

}
