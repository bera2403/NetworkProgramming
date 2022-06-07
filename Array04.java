package com.array01.onedemesion;

public class Array04 {

	public static void main(String[] args) {
		
//메모리공간    스택       힙
 		       int[] a = {3,4,5}; // a라는 변수안에는 @4945ef(0x3e5eff)
 		       			// [0]	[1]  [2]
 		       int[] b = a;       //0x3e5eff ----> b 는 힙의 있는 인스턴스인{3,4,5} 데이터를 참조한다.
 		       
 		       b[0] = 7; // {7,4,5}		a---> {3, 4, 5} <---b
	}

}
