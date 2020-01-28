import java.util.Scanner;

class Area
{
	int l;
	int b;
	Area(int a,int b)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of l");
		l=s.nextInt();
		System.out.println("enter the value of b");
		b=s.nextInt();
	}
		void returnArea()
	{
		System.out.println(l*b);
	}
	
}
public class program_rectangle {

	public static void main(String[] args) {
		Area obj=new Area(7,8);
		obj.returnArea();
		// TODO Auto-generated method stub

	}

}
