package LoopingStatment;

public class table {

	public static void main(String[] args) {
		
		int i=2;
		int j=1;
		 int k=i*j; 
		for(i=2; i<=10; i++)
        {
            for(j=1; j<=10; j++)
            {
            k=i*j; 
            System.out.println(i+"*"+j+"="+k);
            // i++
            }
        }

	}

}
