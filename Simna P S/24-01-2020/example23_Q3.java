import java.util.Scanner;

public class example23_Q3 
{

	public static void main(String[] args) 
	{
		int i,j,a,sum=0,avg = 0;
		int Array[] = new int[20];   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
        for (i = 0; i < 10; i++)
        {
        	Array[i]= scanner.nextInt();
        }
        for (i = 0; i < 10; i++) 
        {
 
            for (j = i + 1; j < 10; j++)
            {
 
                if (Array[i] > Array[j]) 
                {
 
                    a =  Array[i];
                    Array[i] = Array[j];
                    Array[j] = a;
 
                }
            }
            }
            for(i=0;i<10;i++)
            {
            	sum=sum+Array[i];
            	avg=sum/10;
            }
            System.out.println("The maximum number is: "+ Array[9]);
            System.out.println("The minimum number is: "+ Array[0]);
            System.out.println("Average: "+ avg);
 

	}

}
