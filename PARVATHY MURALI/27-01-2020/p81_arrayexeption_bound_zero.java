import java.util.Scanner;

public class p81_arrayexeption_bound_zero {
public static void main(String[] args) {
		
		{
			
			try
			{
				int a[]=new int[5];
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<=5;i++)
				{
					a[i]=sc.nextInt();
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arthemetic Execption occurs");
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBound Execption occurs");
			}
			catch (Exception e)
			{
				System.out.println("Divided by zero error");
			}
			 finally
		        { 
		            System.out.println("array is executed");
		           
		        }  
		}
		

	}

	}


