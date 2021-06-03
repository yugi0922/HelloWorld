package matome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.stream.Stream;

public class Q24 {

	public static void main(String[] args) {
		Path dir = Paths.get(System.getProperty("user.home"));
		try(Stream<Path> pathStrean = Files.walk(dir)){
			pathStrean.forEach(path -> {
				try {
					FileTime time = Files.readAttributes(path, BasicFileAttributes.class).lastAccessTime();
					System.out.println(path + ":" + time);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}

	}

}
