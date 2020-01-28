import java.util.Scanner;

class programming
{
	
	void display(String s)
	{
		System.out.println("I love " + s);
	}
	void display()
	{
		System.out.println("I love programming languages");
	}
}
public class pgm40_pgming_cls {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String m=sc.nextLine();
		programming obj=new programming();
		obj.display(m);
		//obj.display();

	}

}
