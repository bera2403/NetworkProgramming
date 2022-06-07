package com.array01.onedemesion;

public class Array01 {

	public static void main(String[] args) {

		// int arr[5]; // 컴파일 오류가 발생한다.

		// 배열의 생성 방법 1 : 선언과 초기화를 별개
		int arr[]; // int [] arr2; 배열의 길이 위치를 바꿔도 된다.

		arr = new int[5];

		// 1,2,3,4,5 값 입력
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// 배열 생성 방법2 : 선언과 동시에 초기화
		
		// int arr2[] = new int[] {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		int arr3[] = {1,2,3};
		// 문자 배열 : 기본 값은 '' (공백)
		char ch[] = {'a','b','c','d','e'};
		//char ch = new char[]{'a','b','c','d','e'};;
		char ch2[] = {'a','b','c'};
		
		// 문자열 배열 : 기본 값은 null(참조 자료형의 기본값은 null)
		
		String st[] = {"Hello", "Java", "World", "Well", "Cometo"};
		
		int [] arr4 = new int[4]; //4*4 16바이트
		char [] ch4 = new char[2]; // 2*2 4바이트
		boolean [] b1 = new boolean[3]; //1*3 3바이트 
		String [] st2 = new String[3]; //?*3 길이가 정해지지 않았다.
	}

}
