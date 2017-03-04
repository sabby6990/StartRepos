package Accenture;

import java.util.HashMap;
import java.util.Map;

import model.Employee;
import model.ModelMap;

interface demo{
	
	default String method(){
		return "default method";
	};
	
	 static String method1(){
		return "";
	};
}


class parent{
	 void show(){
		System.out.println("parent show");
	}
}


public class Test extends parent{
 
	  void show(){
		System.out.println("child static show");
	}
	
 	public static void main(String[] args) {
 	Employee emp = new Employee("a", "b", 12);
 	Employee emp1 = new Employee("a", "b", 12);
 	
 	parent p = new Test();
 	p.show();
 	
 	
 	
 	/////////
 	ModelMap model1 = new ModelMap(10, "somevalue");
 	ModelMap model2 = new ModelMap(10, "somevalue");
 	
 	
 	Map<ModelMap,String> map = new HashMap<>();
 	map.put(model1, "saurabh");
 	map.put(model2, "sandesh");
 	map.get("asd");
 	System.out.println(map.size());
 	ModelMap model3 = new ModelMap(10, "somevalue");
 	System.out.println(map.get(model3));
 	String[] a={"a"};
 	main(a, 1);
	}
 	
 	public static void main(String[] args,Integer a) {
		System.out.println("overloaded main method");
	}
}


