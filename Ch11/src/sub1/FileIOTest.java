package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* ��¥: 2021/05/27
* �̸�: ��ο�
* ����: �ڹ� ���� ����� ��Ʈ�� �ǽ��ϱ�
*/


public class FileIOTest {
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata\\Desktop\\test1.txt";
		String path2 = "C:\\Users\\bigdata\\Desktop\\test2.txt";
		
		
		// ���ϰ� �Է½�Ʈ�� ����
			try {
				
				FileInputStream fis = new FileInputStream(path1);
				FileOutputStream fos = new FileOutputStream(path2);
				
				int value = 0;
				
				while(true) {
					
					// ��Ʈ�����κ��� ������ �б�
					value = fis.read();
					
					if(value == -1) {
						// �� �̻� ���� �����Ͱ� ���� �� ����
						break;
					}
					
					//char ch = (char)value;
					//System.out.print(ch);
					fos.write(value);
					
				}  // while end
				
				// ��Ʈ�� ����
				fis.close();
				fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		System.out.println("���α׷� ����...");	
		
	}  // main end

}
