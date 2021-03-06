package chapter11;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample11_8 {

	public static void main(String[] args) {
		String sql = "select dept_name from java_gold.department  order by dept_code;";
		try(Connection con = DbConnector.getConnect();
			Statement stmt = con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
		    ResultSet rs = stmt.executeQuery(sql)){
		DatabaseMetaData m = con.getMetaData();
		System.out.format("[TYPE_FORWARD_ONLY] %s%n",
				m.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
		System.out.format("[TYPE_SCROLL_INSENSITIVE] %s%n",
				m.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
		System.out.format("[TYPE_SCROLL_SENSITIVE] %s%n",
				m.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
		rs.last(); //最終行に移動
		System.out.println("最後の行番号 : " + rs.getRow());
		rs.afterLast(); //最終行の次の行に移動
		while(rs.previous()) { //逆方向にスクロール
			System.out.println("dept_name : " + rs.getString(1) );
		}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
