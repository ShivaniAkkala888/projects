package misc;

class Test{

	   static int i = 10;

	   static int j;

	   static{//static block

	       System.out.println("Initializing the Static Variable using Static Block ...");

	       j = i * 5;

	   }

	}

	public class StaticBlock{

	   public static void main(String args[]){

	       System.out.println("Value of i is: " + Test.i);

	       System.out.println("Value of j is: " + Test.j);

	   }

	}
