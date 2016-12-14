package advance;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {

    public static void main(String[] args) {
        Function<Supplier<Long>, String> function = (t) -> "Value is " + t.get();
        String value = function.apply(() -> 1L);
        System.out.println(value);
    }

}
