package chapter11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample11_1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//２ データベースの指定
			String url = "jdbc:mysql://localhost:3306/mysql";
			//３　データベースとの接続
			con = DriverManager.getConnection(url, "root", "ks091810");
			//４　ステートメントの取得
			stmt = con.createStatement();
			//５　SQL文の実行
			String sql = "SELECT dept_code,dept_name FROM java_gold.department";
			rs = stmt.executeQuery(sql);
			//６　結果の取得と処理
			while(rs.next()) {
				System.out.println("dept_code: " + rs.getInt(1) );
				System.out.println("dept_name: " + rs.getString(2) );
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
