package sub1;

public class Account {
	
	// �Ӽ�(��� ����): Ŭ������ ��������� private �������� ĸ��ȭ.
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// ������: ��������� �ʱ�ȭ�Ͽ� ���� �޼���.
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���(��� �޼���)
	public void deposit(int money) {
		this.money += money;
	}

	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("================");
		System.out.println("����� :"+ this.bank);
		System.out.println("���¹�ȣ :"+id);
		System.out.println("�Ա��� :"+name);
		System.out.println("�����ܾ� :"+money);
		System.out.println("================");
	}

}