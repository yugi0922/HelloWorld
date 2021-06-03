package matome;

public class Outer {
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void doIt(int y) {
		class Inner{//line n1
			int z = 0;
			
			public void doIt() {
				z = x * y; // line n2
				System.out.println(z);
			}
		}
		
		new Inner().doIt(); //line n3
	}
}
