import java.util.Scanner;

public class program51_set2_q4 {

	public static void main(String[] args) {
		int rows,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows of pyramid..");
		rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
