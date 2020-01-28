import java.util.Scanner;

class mimx
{
	int c=0,max=0,min,sum=0,avg;
	void calc(int a)
	{
		c++;
		if(c==1)
		{
			min=a;
		}
	if(a>max)
	{
		max=a;
	}
	else if(a<min)
	{
		min=a;
	}
	sum=sum+a;
	avg=sum/c;
	}
	void display()
	{
		System.out.println("maximum = "+max);
		System.out.println("minimum = "+min);
		System.out.println("average = "+avg);
	}
}
public class program48_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n;
System.out.println("enter 10 integers");
Scanner sc=new Scanner(System.in);
mimx obj=new mimx();
for(i=0;i<10;i++)
{
	n=sc.nextInt();
	obj.calc(n);
	}
obj.display();
	}

}
