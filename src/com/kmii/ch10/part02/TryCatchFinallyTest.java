package com.kmii.ch10.part02;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30};
		
		try {
			for(int i=0; i<=3 ; i++) {
			System.out.println(arr[i]);
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("arr[3]은 없는 인덱스 입니다.");
		}finally {
			System.out.println("저는 에러가 나거나 안나거나 무조건 실행됩니다."); // 생략가능, finally는 에러 유무에 상관없이 무조건 실행 ,주로 db와 연결되는부분.
		}
		
		System.out.println("저는 19번 라인 입니다.");
		
		}

	}


