import java.util.Scanner;

class addamount
{
	int amount=50;
	addamount()
	{
		System.out.println("final amount in bank "+amount);
	}
	addamount(int a)
	{
		int b=amount+a;
		System.out.println("final amount in bank "+b);
	}
}
public class program36_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("do you want to deposit 1 for yes and 0 for no");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n==0)
{
	addamount obj=new addamount();
}
else
{
	System.out.println("enter the amount to be deposited");
	int d=sc.nextInt();
	addamount obj1=new addamount(d);
}
	}

}
