import java.util.Scanner;

class string
{
	String str;
	void length1()
	{
		System.out.println("length of the string : " + str.length());
	}
	void toLower()
	{
		System.out.println("Lower case : " + str.toLowerCase());
	}
}
public class exercise5_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string obj = new string();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		obj.str = sc.next();
		obj.length1();
		obj.toLower();
	} 
}
