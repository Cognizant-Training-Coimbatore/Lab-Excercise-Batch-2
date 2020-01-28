import java.util.Scanner;

public class program_6 {

	public static void main(String[] args) {
		int x,y,z,a,b,c,d;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	z=sc.nextInt();
	a=sc.nextInt();
	b=sc.nextInt();
	c=(x+y+z+a+b);
	d=c/5;
	System.out.println("Sum is" +c+ "and average is" +d);
	}

}
