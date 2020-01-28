import java.util.Scanner;

public class program40 {

	public static void main(String[] args) 
	{
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a no btw 1 n 9");
			n = sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{	
				System.out.println("Multiplication table of "+i);
				for(int j =1;j<=10;j++)
				{
					
					System.out.println(i+" * "+j+" = "+(i*j));
					
				}
				
			}

	}

}
