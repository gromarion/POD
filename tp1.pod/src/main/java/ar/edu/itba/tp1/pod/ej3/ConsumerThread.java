package ar.edu.itba.tp1.pod.ej3;

public class ConsumerThread extends Thread {

	private String name;

	public ConsumerThread() {
		this.name = "Consumer thread";
	}

	public ConsumerThread(String name) {
		this.name = name;
	}

	public void run() {
		while (true) {
			String string = ThreadFactory.getString();
			if (string != null) {
				System.out.println(name + " consumed the string '" + string
						+ "' and counted " + vowels(string) + " vocals.");
			} else {
				System.out.println(name
						+ " didn't find any strings to consume...");
			}
		}
	}

	private int vowels(String string) {
		int ans = 0;
		for (int i = 0; i < string.length(); i++)
			ans = isVowel(string.charAt(i)) ? ans + 1 : ans;
		return ans;
	}

	private boolean isVowel(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}
}
