package chapter6;

import java.io.IOException;

public class Q6_4 {

	public static void main(String[] args) {
		try(Foo o1 = new Foo(); Bar o2 = new Bar() ){
			System.out.print("A");
		}catch(Exception e){
			System.out.print("B");
		}finally {
			System.out.print("C");
		}

	}

	static class Foo implements AutoCloseable{
		@Override
		public void close() throws Exception {
			System.out.print("D");
			
		}
	}
	
	static class Bar implements java.io.Closeable{
		@Override
		public void close(){
			System.out.print("E");
			throw new RuntimeException();
		}
	}
}
