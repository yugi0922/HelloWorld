package chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
	public static Connection getConnect() throws SQLException{
		//２ データベースの指定
		String url = "jdbc:mysql://localhost:3306/mysql";
		//３　データベースとの接続
		Connection con  = DriverManager.getConnection(url, "root", "ks091810");
		
		return con;
		
	}
}
