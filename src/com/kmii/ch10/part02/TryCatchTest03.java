package com.kmii.ch10.part02;

import java.util.Scanner;

public class TryCatchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요");
		String str = scanner.nextLine();  //문자열을 키보드로부터 입력 받음
		
		// System.out.println(str.length()); //문자열 길이 출력
		// 그냥 위에 출력값만 있다면 : console 창에 실행 시 그냥 enter 치면 "" 와 같은것 이라 0 출력- null값은 아님
		
		if (str.length()==0) {
			throw new IllegalArgumentException("문자열은 공란으로 입력하시면 안됩니다"); 	
		} else {
			System.out.println(str.length());
		}
		
		scanner.close();
		
	}

}
