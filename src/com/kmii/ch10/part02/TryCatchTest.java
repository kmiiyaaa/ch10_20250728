package com.kmii.ch10.part02;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		try {
			int result = 100/num;
			System.out.println(result);
		} catch(ArithmeticException e) { // 예외처리 class후 관례상 e 지정
			System.out.println("모든 수는 0으로 나눌 수 없습니다. num값을 다시 확인하세요!");
		}
		
		System.out.println("저는 15번 라인 입니다."); //try - catch 없었으면 위에 오류 시 출력되지 않음

	}

}
