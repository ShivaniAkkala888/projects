package oops;

class employee{
	private int id;
	private String name;
	private float salary;
	
//	default constructor
	public employee() {
		
		
	}
	
	public employee(String name) {
		this.id=1;
		this.name = name;
		this.salary = 80000.0F;
			
	}

	public employee(float salary) {
		this.id=101;
		this.name = "Test";
		this.salary = salary;
	
	}
	
	void getData() {
		
		System.out.println("Employee Detals:" +id +"\t"  +name +"\t" +salary);
	}
	
	
	}
		
		
		


public class constructor {

	public static void main(String[] args) {
		
		employee emp = new employee();
		employee emp1 = new employee("Demo");
		employee emp2 = new employee(12000.00F);
		
		emp.getData();
		emp1.getData();
		emp2.getData();
		

	
		

	}

}
