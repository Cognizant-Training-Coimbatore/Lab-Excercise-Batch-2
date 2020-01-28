import java.util.Scanner;

public class program7_circle_area {

	public static void main(String[] args) 
	{
		double r,a;
		final double pi=3.14;
		System.out.println("enter the radius");
        Scanner scanner=new Scanner(System.in);
        r=scanner.nextInt();
        a = pi * r * r;
        System.out.println("area = "+a);
        
	}

}
