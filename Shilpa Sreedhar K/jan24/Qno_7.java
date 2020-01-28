import java.util.Scanner;

class xyz
{
	static String name;
	xyz(){
		name="unknown";
	}
	public static String getName()
	{
		return name;
	}
	public static void setName(String name1)
	{
		name= name1;
	}
	
}
public class Qno_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String str=sc.nextLine();
		xyz.setName(str);
		System.out.println(xyz.getName());
		sc.close();

	}

}
