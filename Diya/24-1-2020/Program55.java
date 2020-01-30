import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		String s;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.next();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			char b=s.charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
				count++;
		}
		System.out.print(count);
	}

}
