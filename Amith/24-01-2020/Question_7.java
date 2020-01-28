import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) 
	{
		String str;
	System.out.println(" enter your string");
	Scanner sc = new Scanner(System.in);
	str=sc.nextLine();
	String rev=("");
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);

	}

}
