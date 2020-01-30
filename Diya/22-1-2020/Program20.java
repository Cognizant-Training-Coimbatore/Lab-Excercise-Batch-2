import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		int x,i,flag=0;
		System.out.println("Enter the values for x");
		Scanner scanner = new Scanner(System.in);
		for(i=0;i<5;i++)
			{
			x=scanner.nextInt();
			if(x%2!=0)	
			{
				flag++;
			}
			}
		System.out.println("The number of odd numbers is " +flag);
	}

}
