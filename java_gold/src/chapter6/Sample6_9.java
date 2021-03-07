package chapter6;

import java.sql.SQLException;

class MyResource implements AutoCloseable{
	private String msg;
	public MyResource(String msg) {
		this.msg = msg;
	}
	@Override
	public void close() throws Exception {
		System.out.println("close() :" + msg);
		
	}
}
public class Sample6_9 {

	public static void main(String[] args) {
		try(MyResource obj1 = new MyResource("obj1");
			MyResource obj2 = new MyResource("obj2")){
			System.out.println("try�u���b�N���̏���");
			throw new SQLException();
		}catch(SQLException e) {
			System.out.println("catch�u���b�N: SQLException");
		}catch(Exception e) {
			System.out.println("catch�u���b�N: Exception");
		}finally {
			System.out.println("finally �u���b�N");
		}

	}

}
