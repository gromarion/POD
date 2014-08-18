package ar.edu.itba.tp1.pod.ej1;

public class RunnableImplementation implements Runnable {

	private String name = "Thread";
	private String message = "Hello world!";
	private int sleep_time = 0;

	public RunnableImplementation() {
	}

	public RunnableImplementation(String name) {
		this();
		this.name = name;
	}

	public RunnableImplementation(String name, String message) {
		this(name);
		this.message = message;
	}

	public RunnableImplementation(String name, String message, int sleep_time) {
		this(name, message);
		this.sleep_time = sleep_time;
	}

	public void run() {
		try {
			Thread.sleep(sleep_time);
			System.out.println(name + ": '" + message + "'");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
