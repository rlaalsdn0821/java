package ch07;

class Student3{
	
	// �ʵ� 
	String name;  // �л���
	int grade;  // �г�
	String department;  // �а�
	
	Student3(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
	// �⺻ ������
	Student3(){
		
	}
}

public class p169 {
	
	public static void main(String[] args) {
		
		Student3 stu = new Student3("ȫ�浿",4,"����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student3 stu2 = new Student3("�̼���",4,"������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// �⺻ �����ڷ� ��ü ����
		Student3 stu0 = new Student3();
		
	}

}
