package ch07;

class Student1{
	// 필드
	String name;  // 학생명
	int grade;  // 학년
	String department;  // 학과
	
	Student1(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}

public class p167 {
	
	public static void main(String[] args) {
		
		Student1 stu = new Student1("홍길동",4,"소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
	}

}
