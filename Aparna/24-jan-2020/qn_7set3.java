package package2;
import java.util.Scanner;
class abc
{
static String name;
abc()
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
public class qn_7set3 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string..");
			String str=sc.nextLine();
			abc.setname(str);
			System.out.println(abc.getName());
	}

}
