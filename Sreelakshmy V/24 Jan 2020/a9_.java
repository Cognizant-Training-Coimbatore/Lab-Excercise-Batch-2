import java.util.Scanner;
class same
{
	void same1(char a,int n)
	{
      System.out.print("Values are=" +a,+n);
	}
	void same1(int n,char a)
	{
		  System.out.print("values are="+n,+a);
	}
}
public class a9_ {

	public static void main(String[] args) {
		int a;char b;
same ob=new same();
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.next().charAt(0);
ob.same1(a,b);
ob.same1(b,a);

	}

}
