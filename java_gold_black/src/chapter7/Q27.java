package chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q27 {

	public static void main(String[] args) {
		Path file = Paths.get("out.txt");
		try {
			long fileSize = (long)Files.getAttribute(file, "size");
			System.out.println(fileSize);
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}

	}

}
