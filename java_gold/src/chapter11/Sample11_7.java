package chapter11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample11_7 {

	public static void main(String[] args) {
		String[] sqls = {
				"INSERT INTO java_gold.department VALUES" + "(7, 'planning', 'Yokohama', '045-333-xxxx')",
				"select dept_name from java_gold.department where dept_code = 2" 				
		};
		try(Connection con = DbConnector.getConnect();
			Statement stmt = con.createStatement()){
			for(String sql : sqls) {
				boolean isResultSet = stmt.execute(sql);
				if(isResultSet) {
					ResultSet rs = stmt.getResultSet();
					rs.next();
					System.out.println(rs.getString(1));
				}else {
					int count = stmt.getUpdateCount();
					System.out.println(count);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
