package ar.edu.itba.tp1.pod.ej3.b;

import ar.edu.itba.tp1.pod.ej3.ConsumerThread;
import ar.edu.itba.tp1.pod.ej3.ProducerThread;
import ar.edu.itba.tp1.pod.ej3.ThreadFactory;

public class Main_b {
	public static void main(String[] args) {
		try {
			ProducerThread[] producers = ThreadFactory.createProducers(25);
			ConsumerThread[] consumers = ThreadFactory.createConsumers(25);
			for (ProducerThread producer : producers)
				producer.start();
			for (ConsumerThread consumer : consumers)
				consumer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
