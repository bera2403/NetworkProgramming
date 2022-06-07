package com.array01.onedemesion;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		// 1.입력 받은 숫 만큼의 공간을 만들고, 데이터를 입력 받은 다음 출력하시오.
		// 입력예) 필요한 공간 만큼 숫자를 입력하세요.
		System.out.println("1.입력 받은 숫 만큼의 공간을 만들고, 데이터를 입력 받은 다음 출력하시오.");
		System.out.println("필요한 공간 만큼 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int space = sc.nextInt();
		//배열은 고정 배열
		int arr[] = new int[space];
		//C언어는 배열 인덱스에 변수를 넣을 수 없다. 다만, for문 안에서는 예외이다.
		
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
		
//		 2. 입력받은 수 중에 최대값, 최소값을 구하시오.
		// int max = Interger.MIN_VALUE; 정수형 데이터 중 가장 작은 수를 초기화
		// int min = Interger.MIN_VALUE; 정수형 데이터 중 가장 큰 수를 초기화
		
		System.out.println("2. 입력받은 수 중에 최대값, 최소값을 구하시오.");
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
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
		System.out.println();
		
//		3. 입력 받은 수의 짝수의 합을 구하시오.
		System.out.println("3. 입력 받은 수의 짝수의 합을 구하시오.");
		int sum = 0;
		for(int i = 0; i < space; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("입력 받은 수의 짝수의 합 : " + sum);
		System.out.println();
		
		//4. 버블 정렬하시오.
		System.out.println("4. 버블 정렬하시오.");
		bubleSort(arr);  //실인수 : 실제값 R-value
		System.out.println("=====정렬후=====");
		for(int i = 0; i < space; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//버블정렬
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