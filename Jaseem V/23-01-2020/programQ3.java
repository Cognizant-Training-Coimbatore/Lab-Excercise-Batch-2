import java.util.Scanner;

class Area1
{	
     

	 int sd(int x,int y)
	{
		
		 	int ar=x*y;
		 	return ar;
		
	}
}
public class programQ3 {

	public static void main(String[] args)
	
	{	
		Area1 obj = new Area1();
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the length of rectangle :" );
		int a=sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle :" );
		int b =sc.nextInt();
		int ar= obj.sd(a, b);
		System.out.println("The area of rectangle :"+ar);
		
	
		

	}

}
