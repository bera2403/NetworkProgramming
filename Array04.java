package com.array01.onedemesion;

public class Array04 {

	public static void main(String[] args) {
		
//�޸𸮰���    ����       ��
 		       int[] a = {3,4,5}; // a��� �����ȿ��� @4945ef(0x3e5eff)
 		       			// [0]	[1]  [2]
 		       int[] b = a;       //0x3e5eff ----> b �� ���� �ִ� �ν��Ͻ���{3,4,5} �����͸� �����Ѵ�.
 		       
 		       b[0] = 7; // {7,4,5}		a---> {3, 4, 5} <---b
	}

}
