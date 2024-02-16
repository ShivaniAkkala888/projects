package oops;

//user defined
class account{
	private String name;
	private float amount;
	
//	constructor
	public account()
	{
		name="A.SHIVANI'S Saving amount";
		amount=25000;
	}
	

		public void getData() {
			// TODO Auto-generated method stub
			System.out.println("name:" +name +" " + "amount :"+amount );
			
		}
	
}

public class constructor2 {

	public static void main(String[] args) {
		account savings=new account();

		savings.getData();
		

	}

	

}
