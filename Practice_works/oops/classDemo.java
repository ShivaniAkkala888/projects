package oops;
//user defined class
class student{

//	attributes or instance variables - state

	String name,id,branch,group;
	
	
	

	// methods - instance methods - behavior
	void display() {

		System.out.println("Name: " + name);
		System.out.println("id: " + id);
		System.out.println("group: " + group);
		System.out.println("branch: "+ branch);
	}
	
	
	
}

public class classDemo {

	public static void main(String[] args) {
//		object creation - object instantiation
		student s1 = new student();
		s1.name = "A.SHIVANI";
		s1.id ="7001";
		s1.group ="MCA";
		s1.branch = "OsmaniaUniversity";
		s1.display();
		
		
		
		student s2 = new student();
		s2.name = "DHARANI";
		s2.id ="7002";
		s2.group ="EEE";
		s2.branch = "BTECH COLLEGE";
		
		s2.display();
		
		
		
		student s3 = new student();
		s3.name = "SWATHI REDDY";
		s3.id ="7003";
		s3.group ="CSE";
		s3.branch = "MALLAREDDY COLLEGE";
		
		s3.display();
		
		
		student s4 = new student();
		s4.name = "PRATHIBHA";
		s4.id ="7004";
		s4.group ="CSE";
		s4.branch = "ODISA COLLEGE";
		
		s4.display();
		

		



		

	}

}
