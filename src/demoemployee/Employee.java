package demoemployee;

public class Employee {

	String name;
	int age;
	String designation;
	double salary;

	// constructor of the class Employee
	public Employee(String name) {
		this.name = name;
	}

	// assign employee's age
	public void empAge(int empAge) {
		age = empAge;
	}

	// Assign the designation
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}

	// Assign the salary
	public void empSalary(double empSalary) {
		salary = empSalary;
	}

	// Print the Employee details
	public void printEmployee() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Designation:" + designation);
		System.out.println("Salary:" + salary);
		System.out.println("---------------------------");
	}
}
