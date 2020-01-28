import java.util.Scanner;
class prog71_uppercase {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of students: ");
			int n=sc.nextInt();
			String a[]=new String[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLine();
				
			}
			System.out.println("in capital letter");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i].toUpperCase());
				
			}

		}

	}


