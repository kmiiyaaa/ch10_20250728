package com.kmii.ch10.part02.trowsTest;

import java.sql.Connection;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsSample throwsSample = new ThrowsSample() ;

//		try {
//			ThrowsSample throwsSample = new ThrowsSample() ; 
//			throwsSample.ZeroDivid(); // 0나누기 에러 발생!
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("모든 수는 0으로 나눌 수 없습니다.");
//		}
		
		try {
			throwsSample.ZeroDivid(); // 0나누기 에러 발생!
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("19번 라인");
		
		
		
		Connection conn  = null;
		DBTest dbTest = new DBTest();
		
		
		
		try {
			conn = dbTest.conn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
