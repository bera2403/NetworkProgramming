package com.array01.onedemesion;

public class Array02 {

	public static void main(String[] args) {
		
		int arr[] = new int[5]; // �ʱ�ȭ ���� ������ �⺻������ �ʱ�ȭ �Ѵ�.
		
		// ���� ����
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//���� ���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//3000�� �Է��ϰ� ����Ͻÿ�, ���� ��� ����
		int arr2[] = new int[3000];
		for(int i = 0; i < 3000; i++) {
			arr2[i] = i+1;
			System.out.println(arr2[i]);
		}
	}

}
