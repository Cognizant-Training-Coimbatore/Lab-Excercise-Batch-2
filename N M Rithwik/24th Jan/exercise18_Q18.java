import java.util.Scanner;

public class exercise18_Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int n,i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str = sc.next();
		n = str.length();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println("Number of vowels : " + count);
	}

}
