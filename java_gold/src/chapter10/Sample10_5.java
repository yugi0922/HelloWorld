//package chapter10;
//
//public class Sample10_5 {
//
//	public static void main(String[] args) {
//		Share share = new Share();
//		ThreadA threadA = new ThreadA(share);
//		ThreadB threadB = new ThreadB(share);
//		threadA.start();
//		threadB.start();
//
//	}
//
//}
//
//class Share{
//	private int a = 0;
//	private String b;
//	public void set() {
//		a++;
//		b = "data";
//		System.out.println("set() a :" + a + "b: " + b );
//	}
//	
//	public void print() {
//		a--;
//		b = null;
//		System.out.println("print() a : " + a + "b: " + b);
//	}
//	
//}
//
//class ThreadA extends Thread{
//	private Share share;
//	public ThreadA(Share share) {
//		this.share = share;
//	}
//	public void run() {
//		for(int i = 0; i < 5; i++) {
//			share.set();
//		}
//	}
//}
//
//class ThreadB extends Thread{
//	private Share share;
//	public ThreadB(Share share) {
//		this.share = share;
//	}
//	public void run() {
//		for(int i = 0; i < 5; i++) {
//			share.print();
//		}
//	}
//}
//
