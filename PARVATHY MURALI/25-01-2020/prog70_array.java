
public class prog70_array 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int sum=0;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		System.out.println(sum);

	}

}
