package ar.edu.itba.tp1.pod.ej5.ej2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ar.edu.itba.tp1.pod.ej2.CounterThread;
import ar.edu.itba.tp1.pod.ej2.CounterThreadFactory;

public class Main_2_a {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out
					.println("Amount of threads needed! Run configurations in eclipse and specify the amount of threads");
			return;
		}
		int thread_amount = Integer.parseInt(args[0]);
		CounterThread[] threads = CounterThreadFactory.sysoThreadArray(4, 1000);
		ExecutorService es = Executors.newFixedThreadPool(thread_amount);
		for (CounterThread thread : threads)
			es.execute(thread);
	}
}
