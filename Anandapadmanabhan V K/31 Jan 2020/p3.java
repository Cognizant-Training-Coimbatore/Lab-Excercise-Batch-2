import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of hexagon");
		int s=sc.nextInt();
		double Area=((6*s*s)/(4*(Math.tan(3.14/6))));
		System.out.println("The area of hexagon is " + Area);
	}

}
