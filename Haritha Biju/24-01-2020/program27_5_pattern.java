package demo;
/*Write a java program to print the following output using for loop
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5     
*/

public class program27_5_pattern
{
	public static void main(String[] args)
	{ 
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.print('\n');
		}
			
	}
}
