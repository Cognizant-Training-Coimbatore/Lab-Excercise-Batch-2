import java.util.Scanner;
class opr
{
	void display(int m)
	{
		int s=0;
		float av;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[m];
		int i;
		for( i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(i=0;i<m;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("max value"+max);
		int min=a[0];
		for(i=0;i<m;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min value"+min);
		for(i=0;i<m;i++)
		{
			s=s+a[i];
		}
		av=s/m;
		System.out.println("Average"+av);
	}
}
public class average_max_min {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	opr obj=new opr();
	obj.display(n);
	
	
			
	}

}
