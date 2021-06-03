package matome2;

public class Bsample {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		for(int a : arr) {
			if(!(a % 2 == 0 && a > 3)) {
				System.out.print(a);
			}
		}

	}

}
