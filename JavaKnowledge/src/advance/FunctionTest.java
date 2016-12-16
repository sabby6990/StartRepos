package advance;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {

	public static void main(String[] args) {
		/*
		 * the function returns a string while passing a long as paramter
		 */

		/**
		 * TODO check how can you implement a counter variable using the below
		 * code where the function will just accept a counter integer value and
		 * return a incremented value
		 */
		// Function<Supplier<String>, String> function = (t) -> {
		// return t.get();
		// };
		// String value = function.apply(() -> getCount("test"));
		// System.out.println(value);
		// System.out.println(getCount("test"));
		//
		// functionTest(() -> getCount("test"));
		System.out.println(functionTest().apply(() -> "test2"));
		System.out.println(functionTest().apply(() -> 9));
	}

	static Long getCount() {
		return 2L;
	}

	private static <T> T getCount(T t) {
		return t;
	}

	private static <T, R> Function<Supplier<T>, T> functionTest() {
		Function<Supplier<T>, T> function = (t) -> {
			return t.get();
		};
		return function;

	}
}
