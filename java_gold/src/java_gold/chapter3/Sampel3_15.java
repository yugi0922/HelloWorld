package java_gold.chapter3;

interface MyIn<T>{
	void method(T t);
}

class Foo implements MyIn<String>{
	@Override
	public void method(String s) { //ŽÀ‘•ƒNƒ‰ƒX‚P
		System.out.println(s);
		
	}
}

class Bar implements MyIn<Integer>{
	@Override
	public void method(Integer i) {
		System.out.println(i);
	}
}


public class Sampel3_15 {

	public static void main(String[] args) {
		new Foo().method("ABC");
		new Bar().method(10);

	}

}
