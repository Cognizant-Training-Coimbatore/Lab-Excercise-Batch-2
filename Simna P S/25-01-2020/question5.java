import java.util.Scanner;

public class question5 
{

	public static void main(String[] args) 
	{
		int i;
		String friends[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the names: ");
        for (i = 0; i < 5; i++)
        {
        	friends[i]= scanner.next();
        }
        for (i = 0; i < 5; i++)
        {
        	 friends[i] = friends[i].toUpperCase();
        	 System.out.println(friends[i]);
        }
        
       
	}

}
