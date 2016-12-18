package advance;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {

	public static void main(String[] args) {
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
