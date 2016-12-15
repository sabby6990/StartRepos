package advance;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class HigherOrderFunctions {
	
	 public static class Convertor implements BiFunction<Double, Double, Double>,Function<Integer, Integer>{

		@Override
		public Double apply(Double t, Double u) {
			return  t*u;
		}

		@Override
		public Integer apply(Integer counter) {
			return counter++;
		}
	}
	
	public static void main(String[] args) {
		
		
		Function<Supplier<Integer>,Integer> function = (func)->func.get();
		function.apply(()->1);
		
		HigherOrderFunctions.Convertor convertor = new Convertor();
		convertor.apply(1);
		System.out.println(convertor.apply(20D, 50D));
	}
}

