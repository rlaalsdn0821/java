package ch07;

class Student2{
	// 필드
	String name;  // 학생명
	int grade;  // 학년
	String department;  // 학과
	
	Student2(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}


public class p168 {
	
	public static void main(String[] args) {
		
		Student2 stu = new Student2("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student2 stu2 = new Student2("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
	}

}
