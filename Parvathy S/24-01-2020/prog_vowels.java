import java.util.Scanner;

public class prog_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.nextLine();	
		System.out.println("Vowels in a string '"+s+"' are :"); 	
		vowels(s);
		}
	static void vowels(String str)
	{
		char ch;
		int i=0;
		for(int j=0;j<str.length();j++)
		{
		  ch=str.charAt(j);	
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		  {
	            i=1;
		    System.out.println(ch); 		 
		  }
		}
		if(i==0)
			System.out.println("There are no vowels in a entered string"); 
		
	}
	}