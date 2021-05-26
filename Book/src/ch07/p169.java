package ch07;

class Student3{
	
	// 필드 
	String name;  // 학생명
	int grade;  // 학년
	String department;  // 학과
	
	Student3(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
	// 기본 생성자
	Student3(){
		
	}
}

public class p169 {
	
	public static void main(String[] args) {
		
		Student3 stu = new Student3("홍길동",4,"소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student3 stu2 = new Student3("이순신",4,"디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// 기본 생성자로 객체 생성
		Student3 stu0 = new Student3();
		
	}

}
