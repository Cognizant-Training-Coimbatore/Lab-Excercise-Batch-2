import java.util.Scanner;

class num
{
	void display(int num1,int num2)
	{
		int i = num1;
		while (i<=num2)
		{
			System.out.println(i);
			i++;
		}
	}
}
public class pgm46_listnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		num obj= new num();
		int a,b;
		System.out.println("Enter lower limit");
		a = scan.nextInt();
		System.out.println("Enter upper limit");
		b = scan.nextInt();
		obj.display(a, b);
		scan.close();
	}

}
