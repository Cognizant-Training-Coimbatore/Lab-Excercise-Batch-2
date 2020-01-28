import java.util.Scanner;

public class question9 
{

	public static void main(String[] args) 
	{
		int i,j,a,n,flag=0;
		int Array[] = new int[20];   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
        for (i = 0; i < 10; i++)
        {
        	Array[i]= scanner.nextInt();
        }
        System.out.println("Enter the numbers to be verified: ");
        n= scanner.nextInt();
        for (i = 0; i < 10; i++) 
        {
 
            
 
                if (Array[i] == n) 
                {
 
                
                flag=flag+1;;
 
                }
                
        }
        if(flag!=0)
        {
        System.out.println(n+" is present ");
        }
        
        else
        {
        System.out.println(n+" is not present ");
        }

	}

}
