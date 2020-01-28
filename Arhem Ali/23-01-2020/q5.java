import java.util.Scanner;

class st
{
	void length(String st)
	{
		int x=st.length();
		System.out.println("LENGTH: "+x);
	}
	void low(String st)
	{
		String d;
		d=st.toLowerCase();
		System.out.println("LOWER CASE:  "+d);
		
	}
}
public class q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String e=sc.nextLine();
		st ob= new st();
		ob.length(e);
		ob.low(e);



	}

}
