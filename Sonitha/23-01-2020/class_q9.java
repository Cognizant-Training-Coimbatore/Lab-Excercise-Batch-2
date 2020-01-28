import java.util.Scanner;

class print{
	void method(int n,String c)
	{
		System.out.println(n);
		System.out.println(c);
	}
	void method(String c,int n)
	{
		System.out.println(c);
		System.out.println(n);
	}
}
public class class_q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a character");
		String s = sc.next();
		print ob =new print();
		ob.method(s, a);
		ob.method(a, s);
		

	}

}
