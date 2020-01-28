import java.util.Scanner;

public class pro_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int i,j,min;
		int a[]=new int[5];
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					min = a[i];
					a[i] = a[j];
					a[j]=min;
				}
			}
		}
		System.out.println("minimum no:"+a[0]);
	}
}
		
