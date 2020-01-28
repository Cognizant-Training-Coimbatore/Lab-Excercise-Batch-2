import java.util.Scanner;

class Programmming
{
	String s="I love ";
	Programmming()
	{
		s+="Programming language";
		System.out.println(s);
	}
	Programmming(String str)
	{
		s+=str;
		System.out.println(s);
	}
}
public class qstn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Programmming obj= new Programmming();
		System.out.print("enter a language\t:\t");
		String a=sc.next();
		Programmming obj1= new Programmming(a);
		sc.close();
	}

}
