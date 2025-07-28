package com.kmii.ch10.part02;

public class MultiCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		try {
			int a = 10 / 0; // by Zero 에러
		
			int[] arr = {1,2,3};
			System.out.println(arr[4]);  // index out of bounds 에러
		} catch (ArithmeticException e) {  // 0나누기 에러잡는 예외처리
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) { 
			e.printStackTrace();
		}
		*/
		
		
			try {
				int a = 10 / 0; // by Zero 에러

				int[] arr = {1,2,3};
				System.out.println(arr[4]);
			} catch (Exception e) {    // exception - > 다 포함 , 전체적인 예외처리 잡아준다, 여러개 나열할 필요 없음
				e.printStackTrace();
			}
	
		
		System.out.println("18번째줄");
		
	}

}
