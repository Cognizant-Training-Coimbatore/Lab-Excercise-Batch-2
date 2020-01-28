import java.util.Scanner;

public class prog59_random_number {

	public static void main(String[] args) 
	{
		int max,min,i;
		System.out.println("Enter the range: ");
		Scanner s=new Scanner(System.in);
		min=s.nextInt();
	    max=s.nextInt();
		int n=(int)(Math.random()*(max-min+1))+min;
		System.out.println("Random no: is :" +n);
	    // TODO Auto-generated method stub

	}

}
