package ch07;

public class p173 {
	
	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("������");
		Car2 c3 = new Car2("����", "������");
		Car2 c4 = new Car2("black", "���", "ȭ����");
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);
		
	}
	
}

class Car2{
	
	// �ʵ�
	String color;
	String company;
	String type;
	
	Car2(){
		this("white", "���", "����");
	}
	
	Car2(String color, String company, String type) {
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car2(String com, String t){
		this("white", com, t);
	}
	
	Car2(String t){
		this("while", "���", t);
	}
	
	public String toString() {
		return color + "-" + company + "-" + type;
	}
	
}
