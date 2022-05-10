package net.hyosun.app.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCconnection {
	// 디비 연결을위해 정보를 설정한다
	private static Connection conn;
	static {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";//오라클의 주소@localhost:1521:xe
		String username = "user2";
		String password = "12341234";

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e){
			e.printStackTrace();
		}
	}// end static

	public static Connection getDBConnection(){
		return conn;
	}
}
