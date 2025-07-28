package com.kmii.ch10.part01;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40};
		System.out.println(arr[4]); // 배열 요소가 4개 이므로 에러 - 인덱스는 3개까지만 존재
		
		List<String> list = new ArrayList<String>();  //List는 인터페이스라 객체 생성x - 자식 클래스?인 array~로 넣어준다.
		list.add("Korea");
		list.add("Japan");
		
		System.out.println(list.get(2)); //리스트 요소 가져오기 ()안에 인덱스 번호 넣으면 된다.
		//존재하지 않는 인덱스 2에 접근하려 했으므로 IndexOutOfBoundsException 에러 발생
		

	}

}
