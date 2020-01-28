import java.util.Scanner;
class inputint
{
	void display(int a, int b)
	{
		for(int i=a+1;i<b;i++)
		{
			System.out.print("  "+i);
		}
	}
	
}
public class question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		a=input.nextInt();
		b=input.nextInt();
		inputint obj = new inputint();
		obj.display(a, b);
		input.close();
	}

}
