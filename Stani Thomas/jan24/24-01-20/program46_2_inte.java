import java.util.Scanner;

public class program46_2_inte {

	public static void main(String[] args) {
		int a,b,i;
System.out.println("enter 2 integers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
if(a<b) {
for(i=a;i<=b;i++)
{
	System.out.println(i);
}}
else
{
	for(i=b;i<=a;i++)
	{
		System.out.println(i);
	}
}
	}

}
