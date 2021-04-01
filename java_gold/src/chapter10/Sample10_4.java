package chapter10;

public class Sample10_4 {

	public static void main(String[] args) {
		Thread threadA = new Thread(() -> {
			System.out.println("threadA : sleep�J�n");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("threadA : ���荞�݂��L���b�`���܂���");
			}
			System.out.println("threadA : �����ĊJ");
		});
		threadA.start();
		
		try {
			System.out.println("main : sleep�J�n");
			Thread.sleep(2000);
			System.out.println("main : sleep�I��");
			threadA.interrupt(); //�X���b�h�ւ̊��荞��
		}catch(InterruptedException e) {
			System.out.println("main : ���荞�݂��L���b�`���܂���");
			
		}

	}

}
