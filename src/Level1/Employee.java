package Level1;

public class Employee {
	String name;
	double salary;
	int ID;
	
	public Employee(String name, double salary, int ID) {
		this.name = name;
		this.salary = salary;
		this.ID = ID;
	}
	
	public double yearlySalary() {
		return salary * 12;
	}
	public void details() {
		System.out.println("Employee Deatils Are as follows:");
		System.out.println("ID: "+ ID);
		System.out.println("Name: "+ name);
		System.out.println("Salary LPA: "+ yearlySalary());
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Vishwajeet Bamane",38000.00,31253);
		
		emp.details();
	}
}
