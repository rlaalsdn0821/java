package ch07;

class Student4 {
	// �ʵ�
	String name;  // �л���
	int grade;  // �г�
	String department;  // �а�
	
	// 1�� ������
	Student4() {
		
	}
	
	// 2�� ������
	Student4(String n) {
		name = n;
	}
	
	// 3�� ������
	Student4(String n, int g){
		name = n;
		grade = g;
	}
	
	// 4�� ������
	Student4(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
	// �а��� �г��� �Ű������� �޴� ������ (���� �߻�)
	//Student4(String d, int g){
		//department = d;
		//grade = g;
	//}
}

public class p171 {
	
	public static void main(String[] args) {
		
		Student4 stu1 = new Student4();  // 1�� ������
		Student4 stu2 = new Student4("ȫ�浿");  // 2�� ������
		Student4 stu3 = new Student4("ȫ�浿",4);  // 3�� ������
		Student4 stu4 = new Student4("ȫ�浿",4,"����Ʈ�������");  // 4�� ������
		
	}

}
