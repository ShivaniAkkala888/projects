package inheritance;


class Parentclass {
	// default constructor
	Parentclass() {
		System.out.println("Constructor of parent class");
	}

	// arg or parameterized constructor
	Parentclass(String str) {
		System.out.println("parameterized constructor of parent class");
	}

}

class Subclass1 extends Parentclass {

	Subclass1() {
		/*
		 * Compile implicitly adds super() here as the first statement of this
		 * constructor.
		 */
//		super();
		System.out.println("Constructor of child class");
	}

	Subclass1(int num) {
		/*
		 * Even though it is a parameterized constructor. The compiler still adds the
		 * no-arg super() here
		 */
		super("Hello world!!!");// explicit call to super class - super constructor
		System.out.println("arg constructor of child class");
	}

	void display() {
		System.out.println("Hello!");
	}
}

public class Super_constructor{
	public static void main(String args[]) {
		/*
		 * Creating object using default constructor. This will invoke child class
		 * constructor, which will invoke parent class constructor
		 */

		Subclass1 obj = new Subclass1();
		// Calling sub class method
		obj.display();
		System.out.println("*******************");
		/*
		 * Creating second object using arg constructor it will invoke arg constructor
		 * of child class which will invoke no-arg constructor of parent class
		 * automatically
		 */
		Subclass1 obj2 = new Subclass1(10);
		obj2.display();
	}
}
