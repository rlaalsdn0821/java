package ch07;

public class p173 {
	
	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("중형차");
		Car2 c3 = new Car2("현대", "대형차");
		Car2 c4 = new Car2("black", "기아", "화물차");
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);
		
	}
	
}

class Car2{
	
	// 필드
	String color;
	String company;
	String type;
	
	Car2(){
		this("white", "기아", "경차");
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
		this("while", "기아", t);
	}
	
	public String toString() {
		return color + "-" + company + "-" + type;
	}
	
}
