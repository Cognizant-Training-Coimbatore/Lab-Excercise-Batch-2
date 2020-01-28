import java.util.Scanner;

class d1
{
	int firstno,limit,i;
	void display()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number");
		firstno = s.nextInt();
		System.out.println("enter the limit");
		limit = s.nextInt();
		for(i=firstno; i<=limit;i++ )
		{
			System.out.println( +i);
		}
	}
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d1 obj=new d1();
		obj.display();

	}

}
