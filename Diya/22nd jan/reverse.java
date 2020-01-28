import java.util.Scanner;
class reverse
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int n, x, r=0;
System.out.println("Enter a number");
n = sc.nextInt();
while(n!=0)
{
x=n%10;
r=r*10+x;
n=n/10;
}
System.out.println("Reverse of the number is "+ r);
}
}