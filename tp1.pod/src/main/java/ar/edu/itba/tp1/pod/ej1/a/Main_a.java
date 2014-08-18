package ar.edu.itba.tp1.pod.ej1.a;

import ar.edu.itba.tp1.pod.ej1.ThreadExecutor;
import ar.edu.itba.tp1.pod.ej1.ThreadFactory;


public class Main_a {
	public static void main(String[] args) {
		Thread[] threads = ThreadFactory.sysoThreadArray(6);
		ThreadExecutor.execute(threads, "-START-", "-END-");
	}
}
