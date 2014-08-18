package ar.edu.itba.tp1.pod.ej2.c;

import ar.edu.itba.tp1.pod.ej1.ThreadExecutor;
import ar.edu.itba.tp1.pod.ej2.AtomicCounterThread;
import ar.edu.itba.tp1.pod.ej2.AtomicCounterThreadFactory;

public class Main_c {
	public static void main(String[] args) {
		AtomicCounterThread[] threads = AtomicCounterThreadFactory
				.sysoThreadArray(4, 1000);
		ThreadExecutor.execute(threads, "-START-", "-END-");
	}
}
