package com.kmii.ch10.part02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader reader = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			 e.printStackTrace();  // 생략가능하지만, 더 상세히 오류 내용을 찍어준다.
		}
		
		System.out.println("저는 17번라인 입니다.");
		
	}

}
