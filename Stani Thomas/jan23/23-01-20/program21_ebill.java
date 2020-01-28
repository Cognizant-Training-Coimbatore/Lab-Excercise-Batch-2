import java.util.Scanner;

public class program21_ebill {

	public static void main(String[] args) {
		double o,n,u;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter old meter reading");
		o=sc.nextInt();
		System.out.println("enter new meter reading");
		n=sc.nextInt();
		u=n-o;
		System.out.println("No.of units consumed = "+u);
		if(u>=1&&u<=100) {
			System.out.println("price = free");}
			else if(u>=101&&u<=200) {
				System.out.println("price = "+u);
			}
			else if(u>=201&&u<=300) {
				System.out.println("price = "+u*2);
			}
			else if(u>=301&&u<=400) {
				System.out.println("price = "+u*3);
			}
			else if(u>=401) {
				double p=(u*4)+(.1*u*4);
				System.out.println("price = "+p);}
			}
	}


