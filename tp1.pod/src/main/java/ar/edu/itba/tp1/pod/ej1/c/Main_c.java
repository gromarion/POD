package ar.edu.itba.tp1.pod.ej1.c;

import ar.edu.itba.tp1.pod.ej1.RunnableImplementation;
import ar.edu.itba.tp1.pod.ej1.RunnableImplementationFactory;
import ar.edu.itba.tp1.pod.ej1.ThreadExecutor;
import ar.edu.itba.tp1.pod.ej1.ThreadSubclass;
import ar.edu.itba.tp1.pod.ej1.ThreadSubclassFactory;

public class Main_c {
	public static void main(String[] args) {
		ThreadSubclass[] threadSubclasses = ThreadSubclassFactory
				.sysoThreadArray(6);
		ThreadExecutor.execute(threadSubclasses,
				"Thread subclasses executing...", "Thread subclasses done...");
		System.out
				.println("------------------------\nRunnableImplementation executing...");
		RunnableImplementation[] runnableImplementations = RunnableImplementationFactory
				.sysoThreadArray(6);
		for (RunnableImplementation runnableImplementation : runnableImplementations) {
			runnableImplementation.run();
		}
		System.out
				.println("RunnableImplementation done...\n------------------------");
		Thread[] threads = new Thread[6];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(runnableImplementations[i]);
		}
		ThreadExecutor.execute(threads,
				"RunnableImplementation THREADS executing",
				"RunnableImplementation THREADS done...");
	}
}
