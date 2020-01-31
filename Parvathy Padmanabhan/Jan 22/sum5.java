import java.util.Scanner;

public class sum5 {

	public static void main(String[] args) {
		System.out.println("Enter the 5 numbers");
		Scanner soc =new Scanner(System.in);
		float a,b,c,d,e;
		a=soc.nextInt();
		b=soc.nextInt();
		c=soc.nextInt();
		d=soc.nextInt();
		e=soc.nextInt();
		float abcde=a+b+c+d+e;
		float avg5=abcde/5;
		System.out.println("sum "+abcde);
		System.out.println("average "+avg5);

	}

}
