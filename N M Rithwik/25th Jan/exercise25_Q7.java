import java.util.Scanner;

public class exercise25_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = new int[5];
		int num2[] = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 numbers :");
		for(i=0;i<5;i++)
		{
			num1[i] = sc.nextInt();
		}
		System.out.println("Copying....");
		for(i=0;i<5;i++)
		{
			num2[i] = num1[i];
		}
		System.out.println("Printing the contents of second array: ");
		for(i=0;i<5;i++)
		{
			System.out.print(" " + num2[i]);
		}
	}

}
