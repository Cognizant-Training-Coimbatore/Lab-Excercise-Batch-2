import java.util.Scanner;

class area
{
	
	float area(int x,int y)
	{
		 int ar=x*y;
		return ar;
	}
}
public class q3 {

	public static void main(String[] args) {
		area ob= new area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int b = sc.nextInt();
		System.out.println("Enter breadth: ");
		int c= sc.nextInt();
		System.out.println("AREA: "+ob.area(b, c));

	}

}
