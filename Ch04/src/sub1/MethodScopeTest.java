package sub1;

/*
��¥: 2021/05/20
�̸�: ��ο�
����: �ڹ� �޼���(�Լ�) ������ �ǽ��ϱ�..
*/

public class MethodScopeTest {
	// ��������(�������): �޼��� �ܺο� ������ ����.
	static int result = 0;
	
	public static void main(String[] args) {
		// ��������: �޼��忡�� ������ ����, �޼��尡 ����Ǹ� �޸𸮿��� ����.
		int start = 1;
		int end = 10;
		
		result = sum(start,end);
		System.out.println("result:"+result);
		
	} // main end.
	
	public static int sum(int s, int e) {
		int sum = 0;
		
		for(int k=s ; k<=e ; k++) {
			sum += k;
		}
		return sum;
	}
}
