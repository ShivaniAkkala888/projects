package inheritance;


//Shape- parent class
class Shape {
 public void display() {
    System.out.println("Inside display");
 }
}

//Rectangle - intermediate base class
class Rectangle extends Shape {
 public void area() {
    System.out.println("Inside area");
 }
}

//Cube- derived class
class Cube extends Rectangle {
 public void volume() {
    System.out.println("Inside volume");
 }
}


public class Multi_Level_inheritance {
 public static void main(String[] arguments) {

	//derived class
    Cube cube = new Cube();
    cube.display();
    cube.area();
    cube.volume();
 }
}