import java.util.Scanner;

public class qstn__09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 numbers");
		int ar[]=new int[10];
		int search;
		for(int i=0;i<10;i++)
			ar[i]=sc.nextInt();
		System.out.println("enter 10 numbers");
		search=sc.nextInt();
		for(int i=0;i<10;i++)
				if(ar[i]==search)
					System.out.println("Searching element found at pos "+i);
		

	}

}
