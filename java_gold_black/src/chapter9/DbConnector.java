package chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
	public static Connection getConnect() throws SQLException{
		//�Q �f�[�^�x�[�X�̎w��
		String url = "jdbc:mysql://localhost:3306/mysql";
		//�R�@�f�[�^�x�[�X�Ƃ̐ڑ�
		Connection con  = DriverManager.getConnection(url, "root", "ks091810");
		
		return con;
		
	}
}
