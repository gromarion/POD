package ar.edu.itba.tp1.pod.ej4.a;

public class Main_a {
	public static Object first_lock = new Object();
	public static Object second_lock = new Object();

	public static void main(String args[]) {
		FirstThread T1 = new FirstThread();
		SecondThread T2 = new SecondThread();
		T1.start();
		T2.start();
	}

	private static class FirstThread extends Thread {
		public void run() {
			synchronized (first_lock) {
				System.out.println("First thread is holding lock 1...");
				System.out.println("First thread is waiting for lock 2...");
				synchronized (second_lock) {
					System.out.println("First thread is holding lock 1 & 2...");
				}
			}
		}
	}

	private static class SecondThread extends Thread {
		public void run() {
			synchronized (second_lock) {
				System.out.println("Second thread is holding lock 1...");
				System.out.println("Second thread is waiting for lock 2...");
				synchronized (first_lock) {
					System.out
							.println("Second thread is holding lock 1 & 2...");
				}
			}
		}
	}
}
