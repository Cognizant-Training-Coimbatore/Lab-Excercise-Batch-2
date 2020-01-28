import java.util.Scanner;

class string1
{
   int stringlength(String s)
   {
	   return s.length();
   }
   String lowercase(String s)
   {
	   return s.toLowerCase();
   }
}
public class Q5_s_handler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		string1 obj=new string1();
		int le=obj.stringlength(a);
		String st=obj.lowercase(a);
		System.out.println("length      "+le);
		System.out.println("lowercase   "+st);
		
 
	}

}
