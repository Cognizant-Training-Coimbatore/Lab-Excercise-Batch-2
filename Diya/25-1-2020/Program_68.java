
public class Program_68 {

	public static void main(String[] args) {
		int a[]= {3,7,5,2,9};
		int c=0;
		System.out.println("Original array : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println("Array in ascending order : ");
		System.out.print("\n");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println("Array in Descending order : ");
		System.out.print("\n");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
			
		}


	}

}
