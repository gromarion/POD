package ar.edu.itba.tp1.pod.ej3;

import java.util.Stack;

public class ThreadFactory {

	private static Stack<String> strings = new Stack<String>();
	
	public static String getString() {
		if (strings.empty())
			return null;
		return strings.pop();			
	}
	
	public static void addString(String string) {
		strings.push(string);
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
