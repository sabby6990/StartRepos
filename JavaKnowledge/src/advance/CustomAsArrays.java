package advance;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/**
 * @author saurabhamin
 *
 */
public class CustomAsArrays {

	// this is copied directly from the Arrays class ;)

	static class ArrayList<E> extends AbstractList<E> implements RandomAccess, Serializable {

		private static final long serialVersionUID = 4819402265550183170L;
		private E[] a;

		private ArrayList(E[] array) {
			this.a = Objects.requireNonNull(array);
		}

		@Override
		public int size() {
			return a.length;
		}

//		@Override
//		public Object[] toArray() {
//			return a.clone();
//		}
//
//		@Override
//		@SuppressWarnings("unchecked")
//		public <T> T[] toArray(T[] a) {
//			int size = size();
//			if (a.length < size)
//				return Arrays.copyOf(this.a, size, (Class<? extends T[]>) a.getClass());
//			System.arraycopy(this.a, 0, a, 0, size);
//			if (a.length > size)
//				a[size] = null;
//			return a;
//		}

		@Override
		public E get(int index) {
			
			return a[index];

		}

	}

	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <T> List<T> asList(T... a) {

		return new ArrayList<>(a);
	}
	

	public static void main(String[] args) {

		List<Integer> intArray = CustomAsArrays.asList(4, 2, 5, 6, 7, 1, 9);
		intArray.forEach(value -> {
			System.out.println(value);
		});
	}

}
