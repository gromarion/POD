package ar.edu.itba.tp1.pod.ej5.ej1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ar.edu.itba.tp1.pod.ej3.ConsumerThread;
import ar.edu.itba.tp1.pod.ej3.ProducerThread;
import ar.edu.itba.tp1.pod.ej3.ThreadFactory;

public class Main_3_b {
	public static void main(String[] args) {
		try {
			ProducerThread[] producers = ThreadFactory.createProducers(25);
			ConsumerThread[] consumers = ThreadFactory.createConsumers(25);
			ExecutorService es = Executors.newFixedThreadPool(50);
			for (ProducerThread producer : producers)
				es.execute(producer);
			for (ConsumerThread consumer : consumers)
				es.execute(consumer);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}
