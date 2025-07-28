package com.kmii.ch10.part02.test01;

import java.util.Scanner;

public class Test02 {
//	2. 사용자에게 문자열을 입력 받아 문자열의 길이를 출력하는 프로그램을 만드시오.
//	단, 사용자가 문자열을 입력하지 않았을 경우 예외가 발생하지 않도록 처리하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		
		
		try {
			System.out.println(a.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("문자를 입력하세요!");
		}
		
		
	


}
	
}
