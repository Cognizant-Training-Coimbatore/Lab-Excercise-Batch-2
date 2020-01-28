import java.util.Scanner;

public class prog57_vowels {

	public static void main(String[] args) {
		String s1;
		int l,c=0;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		s1=s.nextLine();
		l=s1.length();
		
		for(int i=0;i<l;i++)
		{
			ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				c=c+1;
			}
		}
		System.out.println("Number of vowels= "+c);
		// TODO Auto-generated method stub

	}

}
