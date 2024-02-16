package inheritance;

//Parent Class or Super class or Base class
class Java
{
void display_Java()
{
System.out.println("Java Consists of :");
}
}

//First Child class
class JDK extends Java
{

void display_JDK()
{
System.out.println("Java Development Kit");
}

}

//Second Child class
class JVM extends Java
{

void display_JVM()
{
System.out.println("Java Virtual Machine");
}

}

//Third Child class
class JRE extends Java

{

protected void display_JRE()
{
System.out.println("Java Runtime Environment");
}

}

//Main class
public class Hierarchical_Inheritance
{
public static void main(String[] args)
{

JDK obj_JDK = new JDK();

obj_JDK.display_Java();

obj_JDK.display_JDK();

JVM obj_JVM = new JVM();
obj_JVM.display_JVM();

JRE obj_JRE = new JRE();
obj_JRE.display_JRE();

obj_JRE.display_Java();
}



}

