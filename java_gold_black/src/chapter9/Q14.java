package chapter9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q14 {

	public static void main(String[] args) {
		try(Connection con = DbConnector.getConnect();
			Statement stmt = con.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee")){
			
			rs.absolute(2);
			rs.updateString("name", "Lee");
			rs.updateRow();
			
		} catch (SQLException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}

	}

}
