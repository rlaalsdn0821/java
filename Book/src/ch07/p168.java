package ch07;

class Student2{
	// �ʵ�
	String name;  // �л���
	int grade;  // �г�
	String department;  // �а�
	
	Student2(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}


public class p168 {
	
	public static void main(String[] args) {
		
		Student2 stu = new Student2("ȫ�浿", 4, "����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student2 stu2 = new Student2("�̼���", 3, "������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
	}

}
