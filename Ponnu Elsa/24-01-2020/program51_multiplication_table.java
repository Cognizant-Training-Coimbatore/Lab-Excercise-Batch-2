import java.util.Scanner;
public class program51_multiplication_table
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter the  number:");        
	int n=s.nextInt();
        for(int i=1; i <= n; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}