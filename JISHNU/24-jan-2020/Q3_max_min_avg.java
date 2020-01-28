package day3;
import java.util.Scanner;
class calc
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int max,min,total=0,avg=0;
	void call()
	{
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void calc()
	{
		max=a[1];
		min=a[1];
		for(int i=0;i<10;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		for(int i=0;i<10;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		for(int i=0;i<10;i++)
		{
			total=total+a[i];
		}
		avg=total/10;
	}
	void print()
	{
		System.out.println("Max= "+max);
		System.out.println("Min= "+min);
		System.out.println("Avg= "+avg);
	}
}
public class Q3_max_min_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc();
		obj.call();
		obj.calc();
		obj.print();
	}

}
