package ar.edu.itba.tp1.pod.ej3;

import java.util.UUID;

public class ProducerThread extends Thread {

	private String name;

	public ProducerThread() {
		this.name = "Producer Thread";
	}

	public ProducerThread(String name) {
		this.name = name;
	}

	public void run() {
		while (true) {
			String random_string = UUID.randomUUID().toString();
			ThreadFactory.addString(random_string);
			System.out.println(name + " has produced the string '"
					+ random_string + "'");
		}
	}
}
