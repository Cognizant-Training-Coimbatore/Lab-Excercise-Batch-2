package demo;

import java.util.Scanner;

class pattern
{
  	void table(int n)
  	{
  		for(int i=1;i<=5;i++)
  		{
  			for(int j=1;j<=i;j++)
  			{
  				
  				System.out.print(j+"\t");
  				
  			}
  			System.out.println("\n");
  		}
  		
  	}
}
public class Question15 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=5;
		
		pattern obj=new pattern();
		obj.table(a);
	}

}
