package test1;
import java.util.Scanner;

/*
날짜: 2021/05/20
이름: 김민우
내용: 자바 조건문 연습문제..
*/

public class JavaTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				System.out.print("점수입력:");
				int score = sc. nextInt();
				
				System.out.println("입력한 점수는"+score+"입니다.");
				
				switch(score/10) {
				case 10:
				case 9:
					System.out.println("등급은 A입니다.");
					break;
				case 8:
					System.out.println("등급은 B입니다.");
					break;
				case 7:
					System.out.println("등급은 C입니다.");
					break;
				case 6:
					System.out.println("등급은 D입니다.");
					break;
				default:
					System.out.println("등금은 F입니다.");
					break;
				}
		
	}
}
