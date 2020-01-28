import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		try {
		if(n>0) {
			System.out.println(n);
		}
			
		else{
			throw new myexceptions("number is negative" ) ;
		}}
		 catch(myexceptions m) {
			 System.out.println(m);
		 }
    	  
      
	}

}
