package ch07;

class Student1{
	// �ʵ�
	String name;  // �л���
	int grade;  // �г�
	String department;  // �а�
	
	Student1(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}

public class p167 {
	
	public static void main(String[] args) {
		
		Student1 stu = new Student1("ȫ�浿",4,"����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
	}

}
