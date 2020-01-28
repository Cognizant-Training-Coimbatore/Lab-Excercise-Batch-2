import java.util.Scanner;

public class program16_count_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,cout=1;
		System.out.println("Enter the value of a");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter the value of b");
		b=scanner.nextInt();
		System.out.println("Enter the value of c");
		c=scanner.nextInt();
		System.out.println("Enter the value of d");
		d=scanner.nextInt();
		System.out.println("Enter the value of e");
		e=scanner.nextInt();
		if(!(a/2==0))
		{
			cout++;
		}
		if(!(b/2==0))
		{
			cout++;
		}
		if(!(c/2==0))
		{
			cout++;
		}
		if(!(d/2==0))
		{
			cout++;
		}
		if(!(e/2==0))
		{
			cout++;
		}
		System.out.println("count :" +cout);
	}

}
