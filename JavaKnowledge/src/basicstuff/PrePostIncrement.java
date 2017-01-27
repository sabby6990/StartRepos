package basicstuff;

class A {
	static int i = 1111;

	static {
		System.out.println("(before)A1-->"+i);
		i = i-- - --i;
		System.out.println("1--> " + i);
	}

	{
		System.out.println("(before)A2-->"+i);
		i = i++ + ++i;
		System.out.println("2 -->" + i);
	}
}

class B extends A {

	static {
		System.out.println("(before)B1-->"+i);
		i = --i - i--;
		System.out.println("B1 --> " + i);
	}

	{
		System.out.println("(before)B2-->"+i);
		i = ++i + i++;
		System.out.println("B2 -->" + i);
	}
}

public class PrePostIncrement {

	public static void main(String[] args) {
		B b = new B();

		System.out.println(b.i);
		
		
		System.out.println("----------------------simple one ----------------------");
		int j=0;
		System.out.println("1--->before increment "+j);
		System.out.println(j++);
		System.out.println("1--->after increment "+j);
		
		j=0;
		System.out.println("2--->before increment "+j);
		System.out.println(++j);
		System.out.println("2--->after increment "+j);
		
	}

}
