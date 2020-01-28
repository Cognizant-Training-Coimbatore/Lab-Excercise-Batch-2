import java.util.Scanner;

public class prog8_pos_neg {

	public static void main(String[] args) 
	{
		int x;
		
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		
		if(x>0)
		{
			System.out.println(x+" is positive");
		}
		else if(x<0)
		{
			System.out.println(x+" is negetive");		
		}
		// TODO Auto-generated method stub
	}

}
