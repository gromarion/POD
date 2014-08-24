package ar.edu.itba.tp1.pod.ej3;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadFactory {

	private static ConcurrentLinkedQueue<String> strings = new ConcurrentLinkedQueue<String>();

	public static String getString() {
		if (strings.isEmpty())
			return null;
		System.out.println(strings.size());
		return strings.poll();
	}

	public static void addString(String string) {
		strings.add(string);
	}

	public static ProducerThread[] createProducers(int amount) {
		ProducerThread[] ans = new ProducerThread[amount];
		for (int i = 0; i < amount; i++)
			ans[i] = new ProducerThread();
		return ans;
	}

	public static ConsumerThread[] createConsumers(int amount) {
		ConsumerThread[] ans = new ConsumerThread[amount];
		for (int i = 0; i < amount; i++)
			ans[i] = new ConsumerThread();
		return ans;
	}
}
