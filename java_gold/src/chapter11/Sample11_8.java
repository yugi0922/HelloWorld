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
		rs.last(); //�ŏI�s�Ɉړ�
		System.out.println("�Ō�̍s�ԍ� : " + rs.getRow());
		rs.afterLast(); //�ŏI�s�̎��̍s�Ɉړ�
		while(rs.previous()) { //�t�����ɃX�N���[��
			System.out.println("dept_name : " + rs.getString(1) );
		}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
