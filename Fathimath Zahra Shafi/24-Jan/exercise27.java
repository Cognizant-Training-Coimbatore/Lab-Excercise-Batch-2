import java.lang.Math;
import java.util.Scanner;

public class exercise27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = (int) (Math.random()*10)+0;
		int flag=0;
		Scanner scanner=new Scanner(System.in);		
		
		
		for(int i=3;i>0;i--)
		{
		System.out.println("I'm thinking of a number between 0 and 9.Can you guess it?(" +i+ " attempt(s) left): ");
		int x=scanner.nextInt();
		if(x==n)
			{flag=1;
			 System.out.println("correct answer!");break;}
		}
			
		  if(flag==0)
		  System.out.println("Sorry.Wrong number.The correct number is: " +n);
		
			


	}

}
