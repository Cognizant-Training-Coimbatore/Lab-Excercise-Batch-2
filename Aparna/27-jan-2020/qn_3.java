package set_5;

import java.util.Scanner;

public class qn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	//	char [] inputarray=new char[4];
	//	Scanner sc =new Scanner(System.in);
	//	String x=sc.nextLine();
		String str=null;
		
		try
		{
			int len=str.length();
			System.out.println(len);
		}
		catch(NullPointerException e)
		{
			System.out.println("no length");
			System.out.println("exception is" +e);
		}
		
	}

}
