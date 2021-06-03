package chapter11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample11_3 {

	public static void main(String[] args) {
		String sql = "SELECT dept_name FROM java_gold.department where dept_code =" + args[0];
		try(Connection con = DbConnector.getConnect();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
			if(rs != null) {
				System.out.println("rs != null");
			}
			if(rs.next()) {
				System.out.println("dept_neme : " + rs.getString(1) );
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
 
	}

}
