package ch06;

import java.util.Arrays;

public class p131 {

	public static void main(String[] args) {
		
		// �迭 ���� ����
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println("arr1 == arr2:" + (arr1 == arr2));
		
		int[] arr3 = arr1;
		System.out.println("arr1 == arr2:" + (arr1 == arr3));
		
		arr3[0] = 4;
		System.out.println("arr3[0] : "+arr3[0 ]);
		System.out.println("arr1[0] : "+arr1[0 ]);
	}
	
}
