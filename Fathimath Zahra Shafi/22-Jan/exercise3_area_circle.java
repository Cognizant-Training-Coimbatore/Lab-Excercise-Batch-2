import java.util.Scanner;

public class exercise3_area_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi=3.14;
		double r;
		double area=0;
		
		
		System.out.println("enter radius");
		Scanner scanner=new Scanner(System.in);
		
		r=scanner.nextInt();
		
		area = pi*r*r;
		
		System.out.println("area of circle is: " +area);
		

	}

}
