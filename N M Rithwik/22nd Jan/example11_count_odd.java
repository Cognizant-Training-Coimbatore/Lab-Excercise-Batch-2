import java.util.Scanner;

public class example11_count_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,c,d,e,f,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		if(b%2!=0)
			sum=sum+1;
		if(c%2!=0)
			sum=sum+1;
		if(d%2!=0)
			sum=sum+1;
		if(e%2!=0)
			sum=sum+1;
		if(f%2!=0)
			sum=sum+1;
		System.out.println("Count : " + sum);
	}

}
