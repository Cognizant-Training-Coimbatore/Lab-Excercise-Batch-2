import java.util.Scanner;
class stringvow
{
	int count( String a)
	{
		int num=0;
		for(int i=a.length() -1 ; i>=0; i--)
		{
			if(a.charAt(i)=='e'||a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				num++;
			}
		}
		return num;
	}
}
public class question8
{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		stringvow obj= new stringvow();
		System.out.println("Enter the string");
		String a = input.nextLine();
		int b= obj.count(a);
		System.out.println(b);
		input.close();
	}

}
