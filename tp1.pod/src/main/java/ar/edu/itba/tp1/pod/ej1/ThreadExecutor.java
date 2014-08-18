package ar.edu.itba.tp1.pod.ej1;

public class ThreadExecutor {

	public static void execute(Thread thread) {
		thread.start();
	}

	public static void execute(Thread thread, String initial_message,
			String final_message) {
		System.out.println(initial_message);
		execute(thread);
		System.out.println(final_message);
	}

	public static void execute(Thread[] threads) {
		for (Thread t : threads)
			execute(t);
	}

	public static void execute(Thread[] threads, String initial_message,
			String final_message) {
		System.out.println(initial_message);
		execute(threads);
		System.out.println(final_message);
	}
}
