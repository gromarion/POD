package ar.edu.itba.tp1.pod.ej2;

public class CounterThreadFactory {

	public static CounterThread[] sysoThreadArray(int length,
			final String thread_name, final String message, int times) {
		CounterThread[] threads = new CounterThread[length];
		for (int i = 0; i < length; i++)
			threads[i] = new CounterThread(times, thread_name, message);
		return threads;
	}

	public static CounterThread[] sysoThreadArray(int length,
			String thread_names[], String[] messages, int times) {
		if (invalidArguments(length, thread_names.length, messages.length))
			throw new IllegalArgumentException(
					"length, thread_names.length and messages.length must be equal!");
		CounterThread[] threads = new CounterThread[length];
		for (int i = 0; i < length; i++)
			threads[i] = new CounterThread(times, thread_names[i], messages[i]);
		return threads;
	}

	public static CounterThread[] sysoThreadArray(int length,
			final String thread_names[], final String[] messages,
			final int[] sleep_times) {
		if (invalidArguments(length, thread_names.length, messages.length))
			throw new IllegalArgumentException(
					"length, thread_names.length and messages.length must be equal!");
		CounterThread[] threads = new CounterThread[length];
		for (int i = 0; i < length; i++)
			threads[i] = new CounterThread(thread_names[i], messages[i],
					sleep_times[i]);
		return threads;
	}

	public static CounterThread[] sysoThreadArray(int length,
			final String[] messages, int times) {
		return sysoThreadArray(length, defaultNames(length), messages, times);
	}

	public static CounterThread[] sysoThreadArray(int length, int times) {
		return sysoThreadArray(length, defaultNames(length),
				defaultMessages(length), times);
	}

	public static CounterThread[] sysoThreadArray(int length, int[] sleep_times) {
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
