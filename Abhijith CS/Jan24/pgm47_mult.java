import java.util.Scanner;

class mult
{
	void display(int num1)
	{
		int i = 1,j=1;
		while (i<=num1)
		{
			j=1;
			while(j<=10)
			{
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			System.out.println("\n\n");
			i++;
		}
	}
}
public class pgm47_mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		mult obj= new mult();
		int a;
		System.out.println("Enter a number between 1 & 9");
		a = scan.nextInt();
		System.out.println("Multiplication table upto "+a+" is");
		obj.display(a);
		scan.close();
	}

}
