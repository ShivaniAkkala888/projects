package LoopingStatment;

public class primeNumber {

	public static void main(String[] args) {
		// prime numbers
		int i,j ;
        
        for(i=1;i<100;i++){
            int flag = 0;
            for(j=2;j<i;j++){
                if(i%j==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(i+" ");
        }
    }

	}

}
