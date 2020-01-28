import java.util.Scanner;

class calculation
{

	int add(int a1,int a2)
	{
		return (a1+a2);
		
	}
	int sub(int a1,int a2)
	{
		return (a1-a2);
		
	}
	int multi(int a1,int a2)
	{
		return (a1*a2);
		
	}
	 int divi(int a1,int a2)
	{
		return (a1/a2);
		
	}
}
public class class_q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        calculation ob = new calculation();
        System.out.println("The addition of " +a+" and "+b+" is : " + ob.add(a,b));
        System.out.println("The subtraction of " +a+" and "+b+" is : " + ob.sub(a,b));
        System.out.println("The multiplication of " +a+" and "+b+" is : " + ob.multi(a,b));
        System.out.println("The division of " +a+" and "+b+" is : " + ob.divi(a,b));
        
          
	}
}

