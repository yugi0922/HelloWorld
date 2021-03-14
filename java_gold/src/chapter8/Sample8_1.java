package chapter8;

import java.io.File;

public class Sample8_1 {

	public static void main(String[] args) {
		File f1 = new File("C:\\git\\Laboratory\\java_gold\\src\\chapter8");
		File f2 = new File("dir", "a.txt");
		File f3 = new File(f1, "x.txt");
		for(File f: f1.listFiles()) {
			if(f.isFile()) {
				System.out.println("�t�@�C��:" + f.getName());
			}else if(f.isDirectory()) {
				System.out.println("�f�B���N�g��:" + f.getName());
			}
		}
		System.out.println("path for f1:" + f1.getAbsolutePath());
		System.out.println("path for f2:" + f2.getAbsolutePath());
		System.out.println("path for f3:" + f3.getAbsolutePath());
		System.out.println("�g�p���Ă���p�X�̋�؂蕶��" + System.getProperty("file.separator"));
	}

}
