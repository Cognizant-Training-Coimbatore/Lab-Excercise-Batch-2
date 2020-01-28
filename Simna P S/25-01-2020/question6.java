import java.util.Scanner;

public class question6 
{

	public static void main(String[] args) 
	{
		int i,sum=0,avg = 0;
		int Array[] = new int[20];   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
        for (i = 0; i < 5; i++)
        {
        	Array[i]= scanner.nextInt();
        }
        
            for(i=0;i<5;i++)
            {
            	sum=sum+Array[i];
            	
            }
            avg=sum/5;
            System.out.println("Sum : "+ sum);
            System.out.println("Average: "+ avg);
 

	}

}
