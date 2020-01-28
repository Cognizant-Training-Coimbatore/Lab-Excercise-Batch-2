import java.util.Scanner;

public class qstn___03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter String");
			String str=sc.nextLine();
			if (str.length()==0)
				throw new NullPointerException("Null value");
			System.out.println("Length\t:\t"+str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}


	}

}
