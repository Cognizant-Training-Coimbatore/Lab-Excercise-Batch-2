import java.util.Scanner;

public class a31_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a==b)&&(b==c))
{
	System.out.println("All nos are equal");
}
else if((a!=b)&&(b!=c)&&(a!=c))
{
	System.out.println("All nos are different");
}
else
{
	System.out.println("Neither all are equal nor different");
}
	}

}
