package ar.edu.itba.tp1.pod.ej2;

public class AtomicCounterThreadFactory {

	public static AtomicCounterThread[] sysoThreadArray(int length,
			final String thread_name, final String message, int times) {
		AtomicCounterThread[] threads = new AtomicCounterThread[length];
		for (int i = 0; i < length; i++)
			threads[i] = new AtomicCounterThread(times, thread_name, message);
		return threads;
	}

	public static AtomicCounterThread[] sysoThreadArray(int length,
			String thread_names[], String[] messages, int times) {
		if (invalidArguments(length, thread_names.length, messages.length))
			throw new IllegalArgumentException(
					"length, thread_names.length and messages.length must be equal!");
		AtomicCounterThread[] threads = new AtomicCounterThread[length];
		for (int i = 0; i < length; i++)
			threads[i] = new AtomicCounterThread(times, thread_names[i], messages[i]);
		return threads;
	}

	public static AtomicCounterThread[] sysoThreadArray(int length,
			final String thread_names[], final String[] messages,
			final int[] sleep_times) {
		if (invalidArguments(length, thread_names.length, messages.length))
			throw new IllegalArgumentException(
					"length, thread_names.length and messages.length must be equal!");
		AtomicCounterThread[] threads = new AtomicCounterThread[length];
		for (int i = 0; i < length; i++)
			threads[i] = new AtomicCounterThread(thread_names[i], messages[i],
					sleep_times[i]);
		return threads;
	}

	public static AtomicCounterThread[] sysoThreadArray(int length,
			final String[] messages, int times) {
		return sysoThreadArray(length, defaultNames(length), messages, times);
	}

	public static AtomicCounterThread[] sysoThreadArray(int length, int times) {
		return sysoThreadArray(length, defaultNames(length),
				defaultMessages(length), times);
	}

	public static AtomicCounterThread[] sysoThreadArray(int length, int[] sleep_times) {
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
