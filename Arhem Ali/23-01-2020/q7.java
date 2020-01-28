import java.util.Scanner;

class addamount
{
	int c=50;
	 void addamount()
	{
		System.out.println("No amount added");
	}
	 void addamount(int x)
	{
		c=c+x;
		System.out.println("Final amount: "+c);
	}
}
public class q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be addded");
		int b=sc.nextInt();
		addamount ob=new addamount();
		ob.addamount(b);
		ob.addamount();

	}

}
