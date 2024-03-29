package test4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2021/05/27
 * 이름 : 김민우
 * 내용 : 로또 번호 생성기 연습문제
*/
public class JavaTest08 {	
	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<>();

		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);			

			lottoSet.add(num);

			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// 로또번호 정렬
				Set<Integer> treeSet = new TreeSet<>(lottoSet);

		// 로또번호 출력
		Iterator<Integer> iter = treeSet.iterator();

		while(iter.hasNext()) {
		    	System.out.print(iter.next()+" ");
		}
	
		
	}
}