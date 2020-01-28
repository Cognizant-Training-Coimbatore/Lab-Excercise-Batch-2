import java.util.Scanner;

public class program20_count {

	public static void main(String[] args) {
		int a,b,c,d,e,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 no.s");
		a=sc.nextInt();
		if(a%2!=0) {
			s++;
		}
		b=sc.nextInt();
		if(b%2!=0) {
			s++;
		}
		c=sc.nextInt();
		if(c%2!=0) {
			s++;
		}
		d=sc.nextInt();
		if(d%2!=0) {
			s++;
		}
		e=sc.nextInt();
		if(e%2!=0) {
			s++;
		}
		System.out.println("no.of odd no.s = "+s);
		
	}}
			
			
			
			
			
			
			
			
			
		
