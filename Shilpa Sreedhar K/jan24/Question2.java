import java.util.Scanner;

class d2
{
	int n,i,c;
	void mult()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number between 1 and 9");
		n = s.nextInt();
		for(i=1;i<=10;i++)
		{
			c=n*i;
			System.out.println(+n+ "*" +i+ "=" +c);
		}
	}
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d2 obj=new d2();
		obj.mult();

	}

}
