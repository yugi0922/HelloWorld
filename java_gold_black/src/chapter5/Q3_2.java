package chapter5;

public class Q3_2 {

	public static void main(String[] args) {
		try {
			x();
		} catch(Throwable e){
			while(e != null) {
				System.out.println(e.getMessage());
				e = e.getCause();
			}
		}
	}

	
	static void x() throws Exception {
		try {
			y();
		} catch(Exception e){
			throw new Exception("exception in x()",  e);
		}
	}
	
	
	static void y() throws Exception {
		try {
			z();
		} catch(Exception e){
			throw new Exception("exception in y()",  e);
		}
	}
	
	
	
	static void z() throws Exception{
		throw new Exception("exception in z()");
	}

}
