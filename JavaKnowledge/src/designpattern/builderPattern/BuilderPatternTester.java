package designpattern.builderPattern;

public class BuilderPatternTester {
	public static void main(String[] args) {
		TestModel model = new TestModel.TestModelBuilder().withFirstName("saurabh").withLastName("amin")
				.withSalary(50000).build();

		System.out.println(model.getFirstName() + " : " + model.getLastName() + " : " + model.getSalary());
	}
}
