package jan31;

import java.util.Scanner;

public class Question11 {
	static int isPowerOfFour(int n) 
    { 
        if(n == 0) 
        return 0; 
        while(n != 1) 
        {  
            if(n % 4 != 0) 
            return 0; 
            n = n / 4;      
        } 
        return 1; 
	
}

	public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter a number : ");
		  int a = s.nextInt(); 
	        if(isPowerOfFour(a) == 1) 
	         System.out.println(a +  
	                           " is a power of 4"); 
	        else
	         System.out.println(a +  
	                           "is not a power of 4");

	}

}
