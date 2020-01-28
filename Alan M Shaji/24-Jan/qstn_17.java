import java.util.Scanner;

class WXYZ
{
	static String name;
	WXYZ()
	{
		name="Unknown";
	}
	public static String getName() {
		return name;
	}

	public static void setName(String name1) {
		name = name1;
	}
}
public class qstn_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string\t:\t");
		String str=sc.nextLine();
		WXYZ.setName(str);
		System.out.println(WXYZ.getName());
		sc.close();
	}

}
