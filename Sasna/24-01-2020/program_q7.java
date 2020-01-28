
import java.util.Scanner;

class guess
{
void guess1(int a,int p)
{
if(a!=p)
{
System.out.println("Sorry wrong no");
}
else
{
System.out.println("Correct no"+p);
}

}
void guess2(int b,int p)
{
if(b!=p)
{
System.out.println("Sorry wrong no");
}
else
{
System.out.println("Correct no"+p);
}

}
void guess3(int c,int p)
{
if(c!=p)
{
System.out.println("Sorry wrong no");
System.out.print("Correct no is="+p);
System.exit(0);
}
else
{
System.out.println("Correct no"+p);

}
}
}

public class Ass4
{

public static void main(String[] args)
{
int n,x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real no");
n=sc.nextInt();
System.out.println("Iam thinking of a no between 0 and 9.Can you guess it?");
x=sc.nextInt();
guess ob=new guess();
ob.guess1(x,n);
System.out.println("Iam thinking of a no between 0 and 9.Can you guess it?");
y=sc.nextInt();
ob.guess1(y,n);
System.out.println("Iam thinking of a no between 0 and 9.Can you guess it?");
z=sc.nextInt();
ob.guess1(z,n);
}

}
