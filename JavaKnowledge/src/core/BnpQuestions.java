package core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class CustomObj implements Comparable<CustomObj> {
	private Integer id;

	public CustomObj(Integer id) {
		super();
		this.id = id;
	}

	@Override
	public int compareTo(CustomObj o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		}
		return 0;
	}

}

public class BnpQuestions {
	static void stringEquals() {
		System.out.println("-------STRING == WALA ------");
		int a1=5;
		String sd="5";
		String s = "hell5";
		String s1 = "hell" + 5;

		System.out.println(s == s1);

		String s2 = "hell" + s.length();
		String s3 = "hell" + s.length();
		System.out.println(s == s2);

		System.out.println(s2.equals(s3));
		
		int a=10;
		int b=10;
		System.out.println(a==b);
	}

	public static void main(String[] args) {

		Map map = new HashMap<>();
		Object[] obj = new Object[4];
		obj[0] = map.put("a", "String");
		obj[1] = map.put("b", new Integer(10));
		obj[2] = map.put("a", "String2");

		for (int i = 0; i < obj.length; i++)
			System.out.println(obj[i] + "");

		System.out.println("---------HASH SET----------");

		Set setWala = new HashSet();
		boolean[] a = new boolean[5];
		a[0] = setWala.add("a");
		a[1] = setWala.add(new Integer(10));
		a[2] = setWala.add("b");
		a[3] = setWala.add("a");
		a[4] = setWala.add(new Object());

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i] + "");

		System.out.println("---------TREE WALA-----------");
		Set treeWala = new TreeSet();
		boolean[] b = new boolean[5];
		// b[0] = treeWala.add(new CustomObj(2));
		b[1] = treeWala.add(new CustomObj(1));
		// b[1] = treeWala.add(new Integer(10));
		// b[1] = treeWala.add(new CustomObj());
		//b[2] = treeWala.add(1);
		// b[3] = treeWala.add("a");
		// b[4] = treeWala.add(new Object());

		for (int i = 0; i < b.length; i++)
			System.out.println(b[i] + "");

		stringEquals();

	}

}
