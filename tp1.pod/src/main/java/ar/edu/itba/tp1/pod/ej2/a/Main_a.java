package ar.edu.itba.tp1.pod.ej2.a;

import ar.edu.itba.tp1.pod.ej1.ThreadExecutor;
import ar.edu.itba.tp1.pod.ej2.CounterThread;
import ar.edu.itba.tp1.pod.ej2.CounterThreadFactory;

public class Main_a {
	public static void main(String[] args) {
		CounterThread[] threads = CounterThreadFactory.sysoThreadArray(4, 1000);
		ThreadExecutor.execute(threads, "-START-", "-END-");
	}
}
