package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
* ��¥: 2021/05/27
* �̸�: ��ο�
* ����: �ڹ� �����ͺ��̽� ���α׷��� �ǽ��ϱ�
*/

public class JDBCTest {
	
	public static void main(String[] args) {
		
		// DB ����
		String host = "jdbc:mysql://192.168.10.114:3306/minwookim0821";
		String user = "minwookim0821";
		String pass = "1234";
		
		try {
			// 1�ܰ� = JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// 2�ܰ� = �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);	
			
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����!!!");
			}else {
				System.out.println("�����ͺ��̽� ���� ����!!!");
			}
			
			
			// 3�ܰ� = SQL ���ఴü ����
			// 4�ܰ� = SQL ����
			// 5�ܰ� = SQL ��� ó��(SELECT�� ���)
			// 6�ܰ� = �����ͺ��̽� ��������
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
		
	}

}