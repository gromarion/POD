package ar.edu.itba.tp1.pod.ej5.ej1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ar.edu.itba.tp1.pod.ej1.RunnableImplementation;
import ar.edu.itba.tp1.pod.ej1.RunnableImplementationFactory;
import ar.edu.itba.tp1.pod.ej1.ThreadSubclass;
import ar.edu.itba.tp1.pod.ej1.ThreadSubclassFactory;

public class Main_1_c {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out
					.println("Amount of threads needed! Run configurations in eclipse and specify the amount of threads");
			return;
		}
		int thread_amount = Integer.parseInt(args[0]);
		ThreadSubclass[] thread_subclasses = ThreadSubclassFactory
				.sysoThreadArray(6);
		ExecutorService es = Executors.newFixedThreadPool(thread_amount);
		for (Thread thread : thread_subclasses)
			es.execute(thread);
		Thread[] threads = new Thread[6];
		RunnableImplementation[] runnableImplementations = RunnableImplementationFactory
				.sysoThreadArray(6);
		for (int i = 0; i < threads.length; i++)
			threads[i] = new Thread(runnableImplementations[i]);
		System.out
				.println("------------------------\nRunnableImplementation executing...");

		for (Thread thread : threads)
			es.execute(thread);
	}
}
