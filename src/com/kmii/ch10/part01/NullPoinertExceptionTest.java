package com.kmii.ch10.part01;

public class NullPoinertExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = null; // 참조하고 있는 문자열이 메모리에 없음
		
		System.out.println(data.length());  
		// 참조하고 있는 문자열이 메모리에 존재하지 않는데 존재하지 않는 문자열의 길이를 반환하려고 할 때 => NullPointerException 에러 발생!
		// System.out.println(data.toString());  -> toString : 참조하고 있는 문자열 반환
		

	}

}
