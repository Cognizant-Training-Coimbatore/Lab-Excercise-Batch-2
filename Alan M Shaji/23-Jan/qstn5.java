import java.util.Scanner;
class StringHandler
{
	String str;
	void NoOfCharacters()
	{
		System.out.println("No. of characters\t:\t"+str.length());
	}
	void tolower()
	{
		System.out.println("In Lower Case\t:\t"+str.toLowerCase());
	}
}
public class qstn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		StringHandler obj =new StringHandler();
		System.out.print("enter string\t:\t");
		obj.str=sc.nextLine();
		obj.NoOfCharacters();
		obj.tolower();
		sc.close();
	}

}
