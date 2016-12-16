package advance;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {

    public static void main(String[] args) {
    	/*
    	 * the function returns a string while passing a long as paramter
    	 * */
    	
    	/**
    	 * TODO check how can you implement a counter variable using the below code where the function
    	 * will just accept a counter integer value and return a incremented value
    	 * */
        Function<Supplier<Long>, String> function = (t) -> "Value is " + t.get();
        String value = function.apply(() -> 1L);
        System.out.println(value);
    }

}
