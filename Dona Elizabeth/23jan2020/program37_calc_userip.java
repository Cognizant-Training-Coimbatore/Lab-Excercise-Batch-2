import java.util.Scanner;

class calc
{
	double a,b;
	void add(double x,double y)
	{
		double sum=x+y;
		System.out.println("Addition: "+sum);
	}
	void sub(double x,double y)
	{
		double dif=x-y;
		System.out.println("Subtraction: "+dif);
	}
	void mul(double x,double y)
	{
		double prod=x*y;
		System.out.println("Multiplication: "+prod);
	}
	void div(double x,double y)
	{
		double quo=x/y;
		System.out.println("Division: "+quo);;
	}
}
public class program37_calc_userip {

	public static void main(String[] args) {
		calc obj=new calc();
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
	    double p=sc.nextDouble();
	    double q=sc.nextDouble();
	    obj.add(p, q);
	    obj.sub(p, q);
	    obj.mul(p, q);
	    obj.div(p, q);
	    
	}

}
