import java.util.Scanner;
class Studnts
{
String name;
Studnts (String s)
{
	System.out.println(" The name is"+s);
	
}
Studnts()
{
	name="unknown";
}
}
public class programqn6_studentsname
{

	public static void main(String[] args)
	{
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Studnts obj1=new Studnts(str);
		Studnts obj2=new Studnts();
		System.out.println(obj2.name);
		
		

	}

}
