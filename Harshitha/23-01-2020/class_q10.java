import java.util.Scanner;

class area{
	void print(int l,int b) 
	{
		System.out.println("The area of rectangle : "+ (l*b));
	}
	void print(int a)
	{
		System.out.println("The area of square : "+ (a*a));
	}
}
public class class_q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		area ob = new area();
		System.out.println("Enter the length of the rectangle");
		int len = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int bre = sc.nextInt();
		System.out.println("Enter the side of a square");
		int side = sc.nextInt();
		ob.print(len,bre);
		ob.print(side);
        
	}

}
