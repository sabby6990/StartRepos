package designpattern.builderPattern;

public class TestModel {
	private String firstName;
	private String lastName;
	private Integer salary;

	private TestModel(TestModelBuilder builder){
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.salary = builder.salary;
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}


	public static class TestModelBuilder{
		private String firstName;
		private String lastName;
		private Integer salary;
		/**
		 * @return the firstName
		 */
		public TestModelBuilder withFirstName(String fname) {
			this.firstName=fname;
			return this;
		}
		/**
		 * @return the lastName
		 */
		public TestModelBuilder withLastName(String lname) {
			this.lastName=lname;
			return this;
		}
		/**
		 * @return the salary
		 */
		public TestModelBuilder withSalary(Integer salary) {
			this.salary=salary;
			return this;
		}
		
		public TestModel build(){
			return new TestModel(this);
		}
	}
}
