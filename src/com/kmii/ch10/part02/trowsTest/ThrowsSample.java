package com.kmii.ch10.part02.trowsTest;

public class ThrowsSample {

		public void ZeroDivid() throws Exception {
			//메서드를 호출하는 쪽에서 예외 처리를 하라고 강제하는 구문 -> throws 
		
			
//			try {
//				ThrowsSample throwsSample = new ThrowsSample() ; 
//				throwsSample.ZeroDivid(); // 0나누기 에러 발생!
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("모든 수는 0으로 나눌 수 없습니다.");
//			}
		
			
			System.out.println(10/0);
		} 

		 
	}


