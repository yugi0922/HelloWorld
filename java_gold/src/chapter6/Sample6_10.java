package chapter6;

import java.sql.SQLException;

class MyResourceB implements AutoCloseable{
	private String msg;
	public MyResourceB(String msg) {
		this.msg = msg;
	}
	public void method() throws SQLException{
		throw new SQLException("method()�ł̃G���[");
	}
	@Override
	public void close() throws SQLException {
		System.out.println("close():" + msg);
		throw new SQLException("close�ł̃G���[:" + msg );
		
	}
}
public class Sample6_10 {

	public static void main(String[] args) {
		try(MyResourceB obj1 = new MyResourceB("obj1");
			MyResourceB obj2 = new MyResourceB("obj2")) {
			obj1.method();
			
		}catch(SQLException e) {
			System.out.println("e.getMessage() :" + e.getMessage());
			System.out.println("e.getSuppressed()�Ŏ��o�������");
			Throwable[] errAry = e.getSuppressed();
			System.out.println("�}����O���F" + errAry.length);
			for(Throwable ex : errAry) {
				System.out.println(" " + ex.getMessage());
			}
		}finally {
			System.out.println("finally�u���b�N");
		}

	}

}
