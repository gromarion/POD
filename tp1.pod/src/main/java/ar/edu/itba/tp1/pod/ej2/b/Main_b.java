package ar.edu.itba.tp1.pod.ej2.b;

import ar.edu.itba.tp1.pod.ej1.ThreadExecutor;
import ar.edu.itba.tp1.pod.ej2.SynchronizedCounterThread;
import ar.edu.itba.tp1.pod.ej2.SynchronizedCounterThreadFactory;

public class Main_b {
	public static void main(String[] args) {
		SynchronizedCounterThread[] threads = SynchronizedCounterThreadFactory
				.sysoThreadArray(4, 1000);
		ThreadExecutor.execute(threads, "-START-", "-END-");
	}
}
