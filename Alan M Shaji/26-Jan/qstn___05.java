import java.util.Scanner;

public class qstn___05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);		
		try {
			System.out.println("enter 5 marks");
			int a[]=new int[5];
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
				if (a[i]<0 || a[i]>50)
					throw new Exception("Invalid marks entered");
			}
			System.out.println("entered successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
