import java.util.Scanner;

public class prog7_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 final double c=3.14;
		double area;
		int r;
		System.out.println("Enter the radius:  ");
		r=sc.nextInt();
		area=c*r*r;
		System.out.println("Area is:  "+area);

	}

}
