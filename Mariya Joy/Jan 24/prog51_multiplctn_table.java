import java.util.Scanner;

public class prog51_multiplctn_table {

	public static void main(String[] args) 
	{
		int a,i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number:");        
		a=scanner.nextInt();
		
		for(i=1;i<=a;i++)
		{
			System.out.println(a+" * "+ i + " =" +(a*i));
		}
		// TODO Auto-generated method stub

	}

}
