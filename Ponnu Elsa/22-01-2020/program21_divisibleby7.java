import java.util.Scanner;
public class program21_divisibleby7
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n%7== 0)
        {
            System.out.println("The given number "+n+" is divisible by 7");
        }
       
        else
        {
            System.out.println("The given number "+n+" is not divisible by 7 ");
        }
    }
}