package com.array01.onedemesion;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		// 1.�Է� ���� �� ��ŭ�� ������ �����, �����͸� �Է� ���� ���� ����Ͻÿ�.
		// �Է¿�) �ʿ��� ���� ��ŭ ���ڸ� �Է��ϼ���.
		System.out.println("1.�Է� ���� �� ��ŭ�� ������ �����, �����͸� �Է� ���� ���� ����Ͻÿ�.");
		System.out.println("�ʿ��� ���� ��ŭ ���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int space = sc.nextInt();
		//�迭�� ���� �迭
		int arr[] = new int[space];
		//C���� �迭 �ε����� ������ ���� �� ����. �ٸ�, for�� �ȿ����� �����̴�.
		
		for(int i = 0; i < space; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("arr[" + space + "] = [");
		for(int i = 0; i < space; i++) { 
			System.out.print(arr[i]);
			if(i < space - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
		
//		 2. �Է¹��� �� �߿� �ִ밪, �ּҰ��� ���Ͻÿ�.
		// int max = Interger.MIN_VALUE; ������ ������ �� ���� ���� ���� �ʱ�ȭ
		// int min = Interger.MIN_VALUE; ������ ������ �� ���� ū ���� �ʱ�ȭ
		
		System.out.println("2. �Է¹��� �� �߿� �ִ밪, �ּҰ��� ���Ͻÿ�.");
		int max = 0;
		int min = 2147483647;
		for(int i = 0; i < space; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּڰ� : " + min);
		System.out.println();
		
//		3. �Է� ���� ���� ¦���� ���� ���Ͻÿ�.
		System.out.println("3. �Է� ���� ���� ¦���� ���� ���Ͻÿ�.");
		int sum = 0;
		for(int i = 0; i < space; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("�Է� ���� ���� ¦���� �� : " + sum);
		System.out.println();
		
		//4. ���� �����Ͻÿ�.
		System.out.println("4. ���� �����Ͻÿ�.");
		bubleSort(arr);  //���μ� : ������ R-value
		System.out.println("=====������=====");
		for(int i = 0; i < space; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//��������
	public void bubleSort(int arr[]) {
		int swap = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap = arr[j+1];
					arr[j+1] =  arr[j];
					arr[j] = swap;
				}
			}
		}
	}
}