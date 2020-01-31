package jan31;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of side");
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y=6*x*x;
		int pi;
		int z=(int)(4* Math.tan(Math.PI/6));
		int a=y/z;
		System.out.println("Area of hexegon is : "+a);
		

	}

}
