import java.util.Scanner;
class str
{
	void length(String strg)
	{
		System.out.println("The length of "+strg+"is "+(strg.length()));
	}
}
public class prg38_strlen 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str2=sc.nextLine();
		str ob=new str();
		ob.length(str2);
		

		
	}

}
