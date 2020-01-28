import java.util.Scanner;

class print_multiplication
{
	int n;
	int tab;
	void display()
	{
		for(int i=1;i<=n;i++)
		{
			tab = n*i;
			System.out.println(n + "*" + i + "=" +tab);
		}
	}
	
}
public class question2_multiplication_table {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		print_multiplication obj = new print_multiplication();
		System.out.println("Enter the number N:");
		obj.n=sc.nextInt();
		obj.display();
	}

}
