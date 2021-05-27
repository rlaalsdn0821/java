package test3;

/*
 * 날짜 : 2021/05/27
 * 이름 : 김민우
 * 내용 : 추상클래스, 다형성 연습문제
 */

abstract class Shape {
	public abstract void draw();	
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class JavaTest09 {
	public static void main(String[] args) {
		JavaTest09 here = new JavaTest09();
	
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
	
		here.draw(circle);
		here.draw(triangle);
	}

	public void draw( Shape obj ) {
		obj.draw();
	}
}

