package test3;

/*
 * ��¥ : 2021/05/27
 * �̸� : ��ο�
 * ���� : �������̽� ��������
 */

interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller {
	
	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}
	
	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}
}

public class JavaTest10 {
	public static void main(String[] args) {
		Buyer  buyer  = new Customers();
		Seller seller = new Customers();

		buyer.buy();
		seller.sell();
	}
}