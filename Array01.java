package com.array01.onedemesion;

public class Array01 {

	public static void main(String[] args) {

		// int arr[5]; // ������ ������ �߻��Ѵ�.

		// �迭�� ���� ��� 1 : ����� �ʱ�ȭ�� ����
		int arr[]; // int [] arr2; �迭�� ���� ��ġ�� �ٲ㵵 �ȴ�.

		arr = new int[5];

		// 1,2,3,4,5 �� �Է�
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// �迭 ���� ���2 : ����� ���ÿ� �ʱ�ȭ
		
		// int arr2[] = new int[] {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		int arr3[] = {1,2,3};
		// ���� �迭 : �⺻ ���� '' (����)
		char ch[] = {'a','b','c','d','e'};
		//char ch = new char[]{'a','b','c','d','e'};;
		char ch2[] = {'a','b','c'};
		
		// ���ڿ� �迭 : �⺻ ���� null(���� �ڷ����� �⺻���� null)
		
		String st[] = {"Hello", "Java", "World", "Well", "Cometo"};
		
		int [] arr4 = new int[4]; //4*4 16����Ʈ
		char [] ch4 = new char[2]; // 2*2 4����Ʈ
		boolean [] b1 = new boolean[3]; //1*3 3����Ʈ 
		String [] st2 = new String[3]; //?*3 ���̰� �������� �ʾҴ�.
	}

}
