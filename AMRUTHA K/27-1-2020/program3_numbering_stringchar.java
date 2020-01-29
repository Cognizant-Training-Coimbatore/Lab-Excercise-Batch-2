package packss;

import java.util.Scanner;

public class program3_numbering_stringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String x=sc.nextLine();
		//int l=x.length();
		String str=null;
		
		try {
		 int len=str.length();
			System.out.println("length"+len);
		}
		catch(NullPointerException e){
			System.out.println("null pointer exception"+e);
		}

	}

}
