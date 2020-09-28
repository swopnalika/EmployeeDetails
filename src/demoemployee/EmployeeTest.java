package demoemployee;

public class EmployeeTest {
	public static void main(String args[]) {
		// Create three objects using constructor
		Employee empOne = new Employee("Swopnalika Mohapatra");
		Employee empTwo = new Employee("Saismita Mohanty");
		Employee empThree = new Employee("Nibedita Behera");

		empOne.empAge(22);
		empOne.empDesignation("Web Developer");
		empOne.empSalary(35000);
		empOne.printEmployee();

		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(40000);
		empTwo.printEmployee();

		empThree.empAge(22);
		empThree.empDesignation("Data Analyst");
		empThree.empSalary(30000);
		empThree.printEmployee();

	}
}
