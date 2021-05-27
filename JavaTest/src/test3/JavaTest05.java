package test3;

/*
* ��¥: 2021/05/27
* �̸�: ��ο�
* ����: �̱��� ��ü ��������
*/

class Vehicle {
	private String name;
	private int price;

	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void info() {
		System.out.println("============");
		System.out.println("������ : "+name);
		System.out.println("��   �� : "+price);
	}
}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}

	public static CarFactory getInstance() {
		return instance;
	}

	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	}
}


public class JavaTest05 {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();

		Vehicle avante = factory.createCar("�ƹ���", 2500);
		Vehicle sonata = factory.createCar("�ҳ�Ÿ", 3000);
		
		avante.info();
		sonata.info();
	}	
}
