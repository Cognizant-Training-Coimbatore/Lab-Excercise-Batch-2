import java.util.Scanner;

class maths
{
	int n1,n2,sum,sub,mul;
	float div;
int addition(int a,int b)
{
	sum=a+b;
	return sum;
	
}
int subtraction(int a,int b)
{
	sub=a-b;
	return sub;
	
}
int multiplication(int a,int b)
{
	mul=a*b;
	return mul;
	
}
float division(int a,int b)
{
	div=a/b;
	return div;
	
}
}



public class prog37_mathematical_operations
{

	public static void main(String[] args)
	{
		System.out.println("Enter 2 numbers");
		Scanner s= new Scanner(System.in);
		maths obj=new maths();
		obj.n1=s.nextInt();
		obj.n2=s.nextInt();
		int x=obj.addition(obj.n1,obj.n2);
		System.out.println("Sum= " +x);
		int y=obj.multiplication(obj.n1,obj.n2);
		System.out.println("mul= " +y);
		int z=obj.subtraction(obj.n1,obj.n2);
		System.out.println("Sub= " +z);
		float u=obj.division(obj.n1,obj.n2);
		System.out.println("div= " +u);
		
		
		
		
		
				
		
		
		// TODO Auto-generated method stub

	}

}
