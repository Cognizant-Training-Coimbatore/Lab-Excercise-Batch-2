import java.util.Scanner;
class factorial
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a = sc.nextInt();
int i, fact = 1;
for
(i=1;i<=a;i++)
{
fact = fact*i;
}
{
    System.out.println(" Factorial of " + a +  " is "  + fact);
   }
}
}