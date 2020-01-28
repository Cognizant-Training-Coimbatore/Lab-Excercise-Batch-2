import java.util.Scanner;

public class qs5 {

	public static void main(String[] args) 
	{
		Scanner  sc =new Scanner(System.in);
		String arr[]=new String[5];
		for( int i=0;i<5;i++)
		{
			System.out.println("Enter names: ");
			String st=sc.nextLine();
			arr[i]=st.toUpperCase();
			
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
