import java.util.Scanner;

public class question8 
{

	public static void main(String[] args) 
	{
		int i,j,a;
		int Array[] = new int[20];   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
        for (i = 0; i < 5; i++)
        {
        	Array[i]= scanner.nextInt();
        }
        for (i = 0; i < 5; i++) 
        {
 
            for (j = i + 1; j < 5; j++)
            {
 
                if (Array[i] > Array[j]) 
                {
 
                    a =  Array[i];
                    Array[i] = Array[j];
                    Array[j] = a;
 
                }
            }
            }
        System.out.println("array in ascending order: ");
        for (i = 0; i < 5; i++)
        {
        	 System.out.println(Array[i]);
        }
        for (i = 0; i < 5; i++) 
        {
 
            for (j = i + 1; j < 5; j++)
            {
 
              
 
                    a =  Array[i];
                    Array[i] = Array[j];
                    Array[j] = a;
 
                
            }
         }
        System.out.println("array in descending order: ");
        for (i = 0; i < 5; i++)
        {
        	 System.out.println(Array[i]);
        }

	}

}
