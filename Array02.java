package com.array01.onedemesion;

public class Array02 {

	public static void main(String[] args) {
		
		int arr[] = new int[5]; // 초기화 하지 않으면 기본값으로 초기화 한다.
		
		// 값을 대입
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//값을 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//3000개 입력하고 출력하시오, 값은 상관 없음
		int arr2[] = new int[3000];
		for(int i = 0; i < 3000; i++) {
			arr2[i] = i+1;
			System.out.println(arr2[i]);
		}
	}

}
