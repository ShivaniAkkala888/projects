package oops;


//user defined 
class access{
	
	private int id;
	private String name;
	private String branch;
	public Object operator;
	
//	code or method
	public void setData(int id, String name, String branch) {
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	
	public void getData() {
		System.out.println( "ID :" + id +"\t" +"NAME :"+name + "\t"+"BRANCH :"+branch);
	}

	public void add(double d, double e) {
		// TODO Auto-generated method stub
		
	}

//	public void operator(int i, int j) {
//		// TODO Auto-generated method stub
//		
//	}
	
}


public class encapsulation {

	public static void main(String[] args) {
		access s1=new access ();
		s1.setData(701,"A.SHIVANI","OSMANIA UNIVERSITY");
		s1.getData();
		

	}

}

