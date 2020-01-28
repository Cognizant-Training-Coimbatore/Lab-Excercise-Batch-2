
import java.util.Scanner;
public class program10_odd_even
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n%2== 0)
        {
            System.out.println("The given number "+n+" is Even");
        }
        else if(n %2!= 0)
        {
            System.out.println("The given number "+n+" is Odd");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Even nor Odd ");
        }
    }
}