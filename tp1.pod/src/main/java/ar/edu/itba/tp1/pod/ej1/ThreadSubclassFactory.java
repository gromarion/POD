package ar.edu.itba.tp1.pod.ej1;

public class ThreadSubclassFactory {

	public static ThreadSubclass[] sysoThreadArray(int length,
			final String thread_name, final String message) {
		ThreadSubclass[] threads = new ThreadSubclass[length];
		for (int i = 0; i < length; i++)
			threads[i] = new ThreadSubclass(thread_name, message);
		return threads;
	}

	public static ThreadSubclass[] sysoThreadArray(int length,
			final String thread_names[], final String[] messages) {
		if (invalidArguments(length, thread_names.length, messages.length))
			throw new IllegalArgumentException(
					"length, thread_names.length and messages.length must be equal!");
		ThreadSubclass[] threads = new ThreadSubclass[length];
		for (int i = 0; i < length; i++)
			threads[i] = new ThreadSubclass(thread_names[i], messages[i]);
		return threads;
	}

	public static ThreadSubclass[] sysoThreadArray(int length,
			final String thread_names[], final String[] messages,
			final int[] sleep_times) {
		if (invalidArguments(length, thread_names.length, messages.length))
			throw new IllegalArgumentException(
					"length, thread_names.length and messages.length must be equal!");
		ThreadSubclass[] threads = new ThreadSubclass[length];
		for (int i = 0; i < length; i++)
			threads[i] = new ThreadSubclass(thread_names[i], messages[i],
					sleep_times[i]);
		return threads;
	}

	public static ThreadSubclass[] sysoThreadArray(int length,
			final String[] messages) {
		return sysoThreadArray(length, defaultNames(length), messages);
	}

	public static ThreadSubclass[] sysoThreadArray(int length) {
		return sysoThreadArray(length, defaultNames(length),
				defaultMessages(length));
	}

	public static ThreadSubclass[] sysoThreadArray(int length,
			int[] sleep_times) {
		if (invalidArguments(length, sleep_times.length))
			throw new IllegalArgumentException(
					"length ans sleep_times.length must be equal!");
		return sysoThreadArray(length, defaultNames(length),
				defaultMessages(length), sleep_times);
	}

	/* -Private methods section- */

	private static boolean invalidArguments(int length, int names_length,
			int messages_length) {
		return names_length != messages_length || names_length != length;
	}

	private static boolean invalidArguments(int length, int sleep_times_length) {
		return length != sleep_times_length;
	}

	private static String[] defaultNames(int length) {
		String[] default_names = new String[length];
		for (int i = 0; i < length; i++)
			default_names[i] = "Thread " + (i + 1);
		return default_names;
	}

	private static String[] defaultMessages(int length) {
		String[] default_names = new String[length];
		for (int i = 0; i < length; i++)
			default_names[i] = "Hello world!";
		return default_names;
	}
}
