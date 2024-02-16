package oops;
 class over{
	 
	public static void display(int a){
		
		System.out.println("Arguments: " + a);
	}
	public static void display(int a, int b){
		System.out.println("Arguments: " + a + " and " + b);
	}
	public static void display(int a, int b,float c){
		System.out.println("Arguments: " + a + " and " + b+"  and "+c);
	}
}

public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over abc= new over();
		abc.display (1);
        abc.display (1, 4);
        abc.display (1, 4,5.6F);
		  

	}
}
