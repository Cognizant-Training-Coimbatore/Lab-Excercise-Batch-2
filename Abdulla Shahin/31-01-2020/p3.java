import java.util.Scanner;

public class p3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the side: ");
		int s = sc.nextInt();
		double area = (6*s*s)/(4*(Math.tan(3.14/6)));
		System.out.println(area);

	}

}
