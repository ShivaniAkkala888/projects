package oops;
//user defined
interface Polygon {
	//Abstract method
	int getArea(int length, int breadth);
	}

	//implement the Polygon interface
	class Rectangle implements Polygon {

	// implementation of abstract method
	public int getArea(int length, int breadth) {
	  System.out.println("The area of the rectangle is " + (length * breadth));
	    return (length * breadth);
	}

	}





public class InterfaceOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();

		  System.out.println(r1.getArea(5, 6));

	}

}
