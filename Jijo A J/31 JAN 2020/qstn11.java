import java.util.Scanner;

public class qstn11 {
public static int powof4(int n)
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
		// TODO Auto-generated method stub
System.out.println("Enter the integer");
Scanner xx=new Scanner(System.in);
int n=xx.nextInt();
if(powof4(n) == 1) 
    System.out.println(n +  
                      " is a power of 4"); 
   else
    System.out.println(n +  
                      " is not a power of 4"); 
	}

}
