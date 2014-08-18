package ar.edu.itba.tp1.pod.ej1;

public class ThreadSubclass extends Thread {

	private String name = "Thread";
	private String message = "Hello world!";
	private int sleep_time = 0;

	public ThreadSubclass() {
	}

	public ThreadSubclass(String name) {
		this();
		this.name = name;
	}

	public ThreadSubclass(String name, String message) {
		this(name);
		this.message = message;
	}

	public ThreadSubclass(String name, String message, int sleep_time) {
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
	
	public String name() {
		return name;
	}
	
	public String message() {
		return message;
	}
	
	public int sleepTime() {
		return sleep_time;
	}
}
