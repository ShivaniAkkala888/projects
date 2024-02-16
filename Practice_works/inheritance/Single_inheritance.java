package inheritance;
//super class or base class or parent class
class A{
	int a,b;
	void display(){
		System.out.println("Inside  the class A : " + a + "  " + b);
		
	}
}
//derived class or subclass or child class
class B extends  A{
	int c;
	void show() {
		System.out.println("Inside the class B : " + a + "  " + b + "  " + c);
	}
}




public class Single_inheritance {

	public static void main(String[] args) {
//		object creation or object instances
		B obj = new B();
		obj.a = 35;
		obj.b = 46;
		obj.c = 52;
		
		obj.display();
		obj.show();
	}

}
