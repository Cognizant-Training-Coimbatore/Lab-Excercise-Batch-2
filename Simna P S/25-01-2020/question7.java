import java.util.Scanner;

public class question7 
{

	public static void main(String[] args) 
	{
		int i,j;
		int Array[] = new int[20]; 
		int simna[] = new int[20];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
        for (i = 0; i < 5; i++)
        {
        	Array[i]= scanner.nextInt();
        }
        for (i = 0; i < 5; i++) 
        {
 
            
 
            	simna[i]=Array[i];
           
         }
        for (i = 0; i < 5; i++) 
        {
 
            
 
        	System.out.println(simna[i]);
           
         }

	}

}
