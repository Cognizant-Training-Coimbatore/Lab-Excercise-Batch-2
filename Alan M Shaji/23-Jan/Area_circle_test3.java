import java.util.Scanner;

public class Area_circle_test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter radius-->");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		final double pi=3.14;
		double area=pi*r*r;
		System.out.println("Area of circle-->"+area);
		sc.close();
	}

}
