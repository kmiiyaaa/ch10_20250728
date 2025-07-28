package com.kmii.ch10.part02.trowsTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	
	public Connection conn() throws SQLException {
		String urlString = "DB 접속정보";
		
		return DriverManager.getConnection(urlString);
	}

}
