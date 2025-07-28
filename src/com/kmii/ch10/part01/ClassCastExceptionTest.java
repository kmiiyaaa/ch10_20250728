package com.kmii.ch10.part01;

public class ClassCastExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object ob = new String("Korea"); //	업캐스팅 / Object 모든 class의 조상class - new 뒤에 어떠한 class를 써도 가능.
		Integer a = (Integer) ob; // 다운캐스팅 - ClassCastExceptopn오류 발생 - string 받아온 ob를 정수형으로 강제로 변환하려 함.  
		
	}

}
