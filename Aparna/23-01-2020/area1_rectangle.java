import java.util.Scanner;

class area
{
	int a,b;
	void area12()
	
	{
		
		System.out.println("Enter length: ");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter breadth: ");
		Scanner scanner1=new Scanner(System.in);
		b=scanner1.nextInt();
	}
	int returnarea()
	{
		int z= a*b;
		return z;
	}
	
}
public class area1_rectangle {

	public static void main(String[] args) {
		area obj =new area();
		obj.area12();
		System.out.println("Area:" +obj.returnarea());

	}

}
