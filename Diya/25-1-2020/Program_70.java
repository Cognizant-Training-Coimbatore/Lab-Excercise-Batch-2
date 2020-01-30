import java.util.Scanner;

public class Program_70 {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a[0]=sc.nextInt();
		int smallest = a[0];
		
		for(i=1;i<5;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
			System.out.print("The smallest element is "+smallest);
		

}
}
