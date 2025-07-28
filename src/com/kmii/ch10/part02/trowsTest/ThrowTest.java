package com.kmii.ch10.part02.trowsTest;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = -1;
		if (age<0) {
			throw new IllegalArgumentException("나이는 음수가 올수 없다."); //강제 예외발생 시키기
			// System.out.println("나이는 음수가 올수 없다.");
		}
		
		try {
			throw new ArithmeticException("모든 수는 0으로 나눌 수 없습니다.");
		} catch (Exception e) {
		}
		
		
		System.out.println("14번라인");

	}

}
