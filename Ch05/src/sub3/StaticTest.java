package sub3;

/*
��¥: 2021/05/24
�̸�: ��ο�
����: ����(Ŭ����) ����, ����(Ŭ����) �޼��� �ǽ��ϱ�
*/

public class StaticTest {
	
	public static void main(String[] args) {
		
		Increment int1 = new Increment();
		Increment int2 = new Increment();
		Increment int3 = new Increment();
		
		/*
		 -���������� �ϳ��� �ν��Ͻ��� �����Ǿ� �����ȴ�.
		 -���������� ���� �Ҵ翵��(Method Area)�� �����Ǿ� �ֱ� ������ ��ü ���� ���� �ٷ� ������ �� �ִ�.
		 */
		Increment.num2 += 3;
		Increment.add();
		
		//�̱��� ��ü - ���� - p.185 (pdf ����)
		Calc c = Calc.getInstance();
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(3, 2);
		int r4 = c.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
