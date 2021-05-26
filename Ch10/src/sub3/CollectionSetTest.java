package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* ��¥: 2021/05/26
* �̸�: ��ο�
* ����: �ڹ� �÷��� ���� �ǽ��ϱ�
*/

public class CollectionSetTest {

	public static void main(String[] args) {
		
		// Set ����
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		
		// Set ���� ����
		System.out.println("set ���� ����: "+set.size());
		
		// Set ���� ���
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+", ");
		}
		
		
	}
	
}
