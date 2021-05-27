package test3;

/*
 * ��¥ : 2021/05/27
 * �̸� : ��ο�
 * ���� : �߻�Ŭ����, ������ ��������
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

