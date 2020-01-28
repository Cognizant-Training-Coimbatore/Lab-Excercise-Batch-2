import java.util.Scanner;

public class que8 {

	public static void main(String[] args) {
		String st;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		st=sc.nextLine();
		for( int i=0;i<st.length();i++)
		{
			char k= st.charAt(i);
			if(k=='a'|| k=='e'|| k=='i'||k=='o'||k=='u')
			{
				c=c+1;
			}
		}
		System.out.println(c);

	}

}
