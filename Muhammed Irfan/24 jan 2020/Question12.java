package demo;

import java.util.Scanner;

class multiplication
{
  	void table(int n)
  	{
  		for(int i=1;i<=n;i++)
  		{
  			for(int j=1;j<=n;j++)
  			{
  				int x=i*j;
  				System.out.print(x+"\t");
  				
  			}
  			System.out.println("\n");
  		}
  		
  	}
}
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		multiplication obj=new multiplication();
		obj.table(a);
		
		
	}

}
