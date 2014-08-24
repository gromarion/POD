package ar.edu.itba.tp1.pod.ej5.ej1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ar.edu.itba.tp1.pod.ej3.ConsumerThread;
import ar.edu.itba.tp1.pod.ej3.ProducerThread;

public class Main_3_a {
	public static void main(String[] args) {
		ProducerThread producer = new ProducerThread();
		ConsumerThread consumer = new ConsumerThread();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(producer);
		es.execute(consumer);
	}
}
