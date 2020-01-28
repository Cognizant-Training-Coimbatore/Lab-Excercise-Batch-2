import java.util.Scanner;
class stringhandeler
{stringhandeler(String str)
	{
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
	}}
public class qstn5 {
	public static void main(String[] args) {
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
stringhandeler xx=new stringhandeler(str);
	}

}
