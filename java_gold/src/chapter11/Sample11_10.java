package chapter11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample11_10 {

	public static void main(String[] args) {
		String sql = "select dept_code,dept_address from java_gold.department where dept_code = 4";
		try(Connection con = DbConnector.getConnect();
			Statement stmt = con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)){
			if(rs.next()) {
				System.out.println(rs.getString(2));
				rs.updateString(2, "Chiba");
				rs.updateRow();
			}
			
			
		} catch (SQLException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}

	}

}
