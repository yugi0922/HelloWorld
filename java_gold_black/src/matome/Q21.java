package matome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q21 {

	public static void main(String[] args) {
		Path src = Paths.get("DATA/JAN/log.txt");
		Path dest = Paths.get("DATA/log.txt");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

	}

}
