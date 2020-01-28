import java.util.Scanner;

public class program11_formula
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = s.nextInt();
        System.out.print("Enter the value of a:");
        b = s.nextInt();
        c = (a*a)+2*a*b+b*b;
        System.out.println("Value is:" +c);
    }            
}