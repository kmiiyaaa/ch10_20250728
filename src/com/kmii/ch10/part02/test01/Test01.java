package com.kmii.ch10.part02.test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 사용자에게 두 정 수를 입력 받아 첫 번째 수를 두번째 수로 나눈 몫을 출력하는 프로그램을 만드시오.
//		단, 두번째 수로 입력된 숫자값이 0일때에도 예외가 발생하지 않도록 처리하시오.
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int num;
		try {
			num = a/b;
			System.out.println(num);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		
		
	}

}
