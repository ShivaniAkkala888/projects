package misc;

public class StaticMethod {
	
	// static method
	static void static_method() {
		System.out.println("Static method in Java...called without any object");
	}
	
//	instance method
	void display() {
		System.out.println("Instance method");
		
	}

	public static void main(String[] args)

	{
		StaticMethod s1 = new StaticMethod();
		
//		call instance method
		s1.display();

		static_method();
	}

}