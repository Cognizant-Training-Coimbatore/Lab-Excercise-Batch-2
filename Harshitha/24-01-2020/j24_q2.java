import java.util.Scanner;

public class j24_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter a number between 1 and 9");
     int n = sc.nextInt();
     int mul =1;
     if((n >= 1) && (n <= 9))
     {
    	 for(int i=1;i<=n;i++) {
    		 mul = i*n;
    		 System.out.println(i+ " * " +n +" = " + mul);
    		 
    	 }
     }
    
	}

}
