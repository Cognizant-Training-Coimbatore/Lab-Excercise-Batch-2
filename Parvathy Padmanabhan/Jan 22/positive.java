import java.util.Scanner;
public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner soc =new Scanner(System.in);
		int a;
		a=soc.nextInt();
		if(a>0)
		{
			System.out.println("Positive number");
				
		}
		else if(a==0)
		{
			System.out.println("zero");
				
		}	
		else {
		System.out.println("Negative number");
		}

	}

}
