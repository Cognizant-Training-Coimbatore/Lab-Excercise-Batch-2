import java.util.Scanner;

public class pgm57_number_of_vowels_in_a_string {

	public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int v=0;
	String sr=str.toLowerCase();
	for(int i=0;i<str.length();i++)
	{
		if(sr.charAt(i)=='a'||sr.charAt(i)=='e'|| sr.charAt(i)=='i'||sr.charAt(i)=='o'||sr.charAt(i)=='u')
			
		{
			v++;
		}
	}
	System.out.println("number of vowels: " + v);
	}

}
