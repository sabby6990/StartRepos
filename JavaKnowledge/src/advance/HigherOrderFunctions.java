package advance;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public class HigherOrderFunctions {

	
	static class ArrayList<E> extends AbstractList<E> implements RandomAccess, Serializable{

		private static final long serialVersionUID = 4819402265550183170L;
		private  E[] a;
		ArrayList(E[] array ){
			this.a= Objects.requireNonNull(array);
		}
		
        @Override
        public int size() {
            return a.length;
        }

        @Override
        public Object[] toArray() {
            return a.clone();
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            int size = size();
            if (a.length < size)
                return Arrays.copyOf(this.a, size,
                                     (Class<? extends T[]>) a.getClass());
            System.arraycopy(this.a, 0, a, 0, size);
            if (a.length > size)
                a[size] = null;
            return a;
        }
        
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
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> asList = HigherOrderFunctions.asList(2, 3, 4, 5, 67, 4);

		list.forEach(list1 -> {
			System.out.println(list1);
		});
		System.out.println("-------------------------------");
		asList.forEach(list2 -> System.out.println(list2));
	}

}
