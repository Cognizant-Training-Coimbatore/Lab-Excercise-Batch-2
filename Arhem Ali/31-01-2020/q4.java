import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.println("Enter a string: ");
		String st=sc.nextLine();
		int n=st.length();
		for(int i=n-1;i>=0;i--)
		{
			s=s+st.charAt(i);
		}
		System.out.println("reverse:"+s);

	}

}
