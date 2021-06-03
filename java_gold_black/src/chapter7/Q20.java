package chapter7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q20 {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\abc");
		Path p2 = Paths.get("xyz");
		System.out.println(p1.resolveSibling(p2));

	}

}
