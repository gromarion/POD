package ar.edu.itba.tp1.pod.ej2;

import java.util.concurrent.atomic.AtomicInteger;

import ar.edu.itba.tp1.pod.ej1.ThreadSubclass;

public class AtomicCounterThread extends ThreadSubclass {

	private static AtomicInteger counter = new AtomicInteger();
	private int times;

	public AtomicCounterThread(int times) {
		this.times = times;
	}

	public AtomicCounterThread(int times, String name) {
		super(name);
		this.times = times;
	}

	public AtomicCounterThread(int times, String name, String message) {
		super(name, message);
		this.times = times;
	}

	public AtomicCounterThread(String name, String message, int sleep_time) {
		super(name, message, sleep_time);
	}

	public void run() {
		try {
			Thread.sleep(sleepTime());
			System.out.println(name() + " is incrementing the counter...");
			for (int i = 0; i < times; i++)
				counter.incrementAndGet();
			System.out.println(name() + " says final 'counter' value is "
					+ counter.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
