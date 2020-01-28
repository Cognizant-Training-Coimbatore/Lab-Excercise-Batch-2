import java.util.Scanner;

class Area
{
	int length,breadth;
int returnArea(int l, int b)
{
	return l*b;
}
}
public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Area obj=new Area();
		System.out.println("Area\t-->\t"+obj.returnArea(l, b));
		sc.close();

	}

}
