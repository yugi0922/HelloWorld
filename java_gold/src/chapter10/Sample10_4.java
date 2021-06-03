package chapter10;

public class Sample10_4 {

	public static void main(String[] args) {
		Thread threadA = new Thread(() -> {
			System.out.println("threadA : sleep開始");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("threadA : 割り込みをキャッチしました");
			}
			System.out.println("threadA : 処理再開");
		});
		threadA.start();
		
		try {
			System.out.println("main : sleep開始");
			Thread.sleep(2000);
			System.out.println("main : sleep終了");
			threadA.interrupt(); //スレッドへの割り込み
		}catch(InterruptedException e) {
			System.out.println("main : 割り込みをキャッチしました");
			
		}

	}

}
