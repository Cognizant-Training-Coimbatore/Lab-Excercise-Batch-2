import java.util.Scanner;


public class lab20_remove_from_array {

	public static void main(String[] args) {
		int a[]=new int[5];
		int d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 array elements: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be removed");
		d=sc.nextInt();
		for(int j=0;j<5;j++)
		{
			if(a[j]==d)
			{
				while(j!=4)
				{
					a[j]=a[j+1];
					j++;
				}
			}
		}
		for(int k=0;k<5;k++)
		{
			System.out.println(a[k]);
		}
		
	}

}
