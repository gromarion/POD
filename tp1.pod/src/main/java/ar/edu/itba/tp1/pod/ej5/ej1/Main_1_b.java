package ar.edu.itba.tp1.pod.ej5.ej1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ar.edu.itba.tp1.pod.ej1.ThreadFactory;

public class Main_1_b {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out
					.println("Amount of threads needed! Run configurations in eclipse and specify the amount of threads");
			return;
		}
		int thread_amount = Integer.parseInt(args[0]);
		int[] sleep_times = { 1000, 1500, 2000, 2500, 3000, 3500 };
		Thread[] threads = ThreadFactory.sysoThreadArray(thread_amount,
				sleep_times);
		ExecutorService es = Executors.newFixedThreadPool(thread_amount);
		for (Thread thread : threads)
			es.execute(thread);
	}
}
