package ar.edu.itba.tp1.pod.ej3.a;

import ar.edu.itba.tp1.pod.ej3.ConsumerThread;
import ar.edu.itba.tp1.pod.ej3.ProducerThread;

public class Main_a {
	public static void main(String[] args) {
		ProducerThread producer = new ProducerThread();
		ConsumerThread consumer = new ConsumerThread();
		producer.start();
		consumer.start();
	}
}
