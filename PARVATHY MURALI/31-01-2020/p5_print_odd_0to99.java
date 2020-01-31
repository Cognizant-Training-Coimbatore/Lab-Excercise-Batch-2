//Write a Java program to print the odd numbers from 1 to 99. Prints one number per line
package packone;

public class p5_print_odd_0to99 
{

	public static void main(String[] args) 
	{
		System.out.println("Odd numbers from 0 to 99 includes..\n");
		for(int i=1;i<99;i++)
		{
			if((i%2)!=0)
			{
				System.out.println(i+"\n");
			}
		}

	}

}
