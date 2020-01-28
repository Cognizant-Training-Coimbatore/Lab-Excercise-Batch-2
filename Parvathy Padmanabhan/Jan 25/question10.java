import java.util.Scanner;
class minimum
{
	int minvalue(int a[])
	{
		int min=a[0];
		for(int i=0; i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
}
public class question10 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter values:");
		for (int i=0;i<5;i++)
		{
			a[i]=input.nextInt();
		}
		minimum obj=new minimum();
		int min=obj.minvalue(a);
		System.out.println("Minimum is " +min);
		input.close();
	}

}
