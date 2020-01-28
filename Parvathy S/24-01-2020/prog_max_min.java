import java.util.Scanner;

class numbers
{
	int max = 0,min,avg,sum=0;
	int count=0;
	void calc(int num)
	{
		count++;
		if (count==1)
		{
			min=num;
		}
		if(num>max)
		{
			max=num;
		}
		else if(num<min)
		{
			min=num;
		}
		sum= sum+num;
		avg=sum/count;
	}
	void display()
	{
		System.out.println("Maximum Number:"+max);
		System.out.println("Minimum Number : "+min);
		System.out.println("Average : "+avg);
	}
}
public class prog_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers obj = new numbers();
		Scanner sc = new Scanner(System.in);
		int a,i;
		System.out.println("Enter 10 numbers :");
		for(i=0;i<10;i++)
		{
			a=sc.nextInt();
			obj.calc(a);
		}
		obj.display();
		sc.close();
	}

}