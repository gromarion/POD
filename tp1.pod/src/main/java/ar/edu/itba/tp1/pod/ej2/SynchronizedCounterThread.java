package ar.edu.itba.tp1.pod.ej2;

import ar.edu.itba.tp1.pod.ej1.ThreadSubclass;

public class SynchronizedCounterThread extends ThreadSubclass {

	private static int counter;
	private int times;

	public SynchronizedCounterThread(int times) {
		this.times = times;
	}

	public SynchronizedCounterThread(int times, String name) {
		super(name);
	}

	public SynchronizedCounterThread(int times, String name, String message) {
		super(name, message);
		this.times = times;
	}

	public SynchronizedCounterThread(String name, String message, int sleep_time) {
		super(name, message, sleep_time);
	}

	public void run() {
		synchronized (SynchronizedCounterThread.class) {
			try {
				Thread.sleep(sleepTime());
				System.out.println(name() + " is incrementing the counter...");
				for (int i = 0; i < times; i++)
					counter++;
				System.out.println(name() + " says final 'counter' value is "
						+ counter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
