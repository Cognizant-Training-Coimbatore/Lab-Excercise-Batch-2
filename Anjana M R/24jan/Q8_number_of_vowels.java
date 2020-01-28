import java.util.Scanner;

class vowels
{
	void display(String s)
	{
		int vowcount=0;
		int l=s.length();
		for(int i=0;i<=l-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowcount++;
			}
		}
		System.out.println("vowels"+vowcount);
	}
}
public class Q8_number_of_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		vowels obj=new vowels();
		obj.display(a);
		
		

	}

}
