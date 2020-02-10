package practical_exercises;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("enter 3 numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
        if(a==b && b==c)
        	System.out.println("all numbers are equal");
        else if(a!=b && b!=c)
        	System.out.println("all numbers are different");
        else
        	System.out.println("neither all are equal or different");

	}

}
