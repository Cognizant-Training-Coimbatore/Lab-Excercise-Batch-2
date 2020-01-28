package demo11;
import java.util.Scanner;
class xyz
{
static String name;
xyz()
{
name="unknown";
}
public static String getName()
{
return name;
}
public static void setname(String name1)
{
name=name1;
}
}
public class class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string..");
		String str=sc.nextLine();
		xyz.setname(str);
		System.out.println(xyz.getName());



	}

}
