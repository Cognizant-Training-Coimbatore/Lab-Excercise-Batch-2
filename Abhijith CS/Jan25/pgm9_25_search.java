import java.util.Scanner;

public class pgm9_25_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		int n,flag=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int i,j,a;
		for(i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter an element to search: ");
		n=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(num[i]==n) 
			{
				flag=1;
				System.out.println(n+"found");
			}
		}
		if(flag==0)
		{
			System.out.println(n+"not found");
		}
	}

}
