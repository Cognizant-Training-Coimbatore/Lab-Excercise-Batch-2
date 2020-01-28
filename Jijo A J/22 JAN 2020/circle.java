import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius");
		Scanner soc =new Scanner(System.in);
		float r;
		r=soc.nextFloat();
		final float pi=3.15f;
		float arear=pi*r*r;
		
		System.out.println("area "+arear);


	}

}
