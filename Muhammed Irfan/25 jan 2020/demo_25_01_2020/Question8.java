import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)	
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("decending order is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");		
		}
		System.out.println("\nascending order is");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"\t");		
		}
	}

}
