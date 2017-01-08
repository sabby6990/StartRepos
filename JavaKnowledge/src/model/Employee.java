package model;

public class Employee implements Comparable<Employee>, Cloneable {
	private String name;
	private String lastName;
	private Integer age;

	public Employee(String name, String lastName, Integer age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	// this is from comparable interface
	@Override
	public int compareTo(Employee o) {
		return age - o.getAge();
	}

	// cloning example
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
}
