import java.util.Scanner;
public class programd24_q1_numbers {

	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter the Second number");
		int y=sc.nextInt();
		for(int i=x+1;i<y;i++)
		{
			System.out.println(i);
		}

	}

}
