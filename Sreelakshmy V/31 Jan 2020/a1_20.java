import java.util.Scanner;

	
		public class a1_20 {
			public static void main(String args[])
			{
				int i,p;
			System.out.println("Enter the item to be searched");
			int a[]=new int[10];
			Scanner sc=new Scanner(System.in);
			p=sc.nextInt();
			System.out.println("Enter the array");
			for(i=0;i<10;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<10;i++)
			{
				if(a[i]==p)
				{
					System.out.println("Item"+p+ "found at"+i );
				}
			}

				
			}
			

	}


