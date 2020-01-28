import java.util.Scanner;
class search
{
	int m=0;
	int[] searchelem(int a[], int b)
	{
		int pos[]= {};
		for (int i=0; i<10;i++)
		{
			if (a[i]==b)
			{
				 pos[m]=i;
				 m++;
			}
		}
		return pos;

	}
}
public class question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter:");
		int a[]=new int[10];
		for (int i=0; i<10;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Enter search element:");
		int b = input.nextInt();
		search obj= new search();
		int pos[]= {};
		pos=obj.searchelem(a, b);
		if(obj.m==0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at position  :" );
			for (int i=0;i<pos.length;i++)
			{
				System.out.print(pos[i]);
			}
		}
		input.close();
		
	}

}
