package ar.edu.itba.tp1.pod.ej1.a;

import ar.edu.itba.tp1.pod.ej1.ThreadExecutor;
import ar.edu.itba.tp1.pod.ej1.ThreadFactory;

public class Main_a {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out
					.println("Amount of threads needed! Run configurations in eclipse and specify the amount of threads");
			return;
		}
		int thread_amount = Integer.parseInt(args[0]);
		Thread[] threads = ThreadFactory.sysoThreadArray(thread_amount);
		ThreadExecutor.execute(threads, "-START-", "-END-");
	}
}
