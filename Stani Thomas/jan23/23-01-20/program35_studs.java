import java.util.Scanner;

class studs
{
	studs()
	{
		System.out.println("name :Unknown");
	}
	studs(String str)
	{
		System.out.println("name : "+str);
	}
	
}
public class program35_studs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);


System.out.println("enter the name");
String str1=sc.nextLine();

studs obj1=new studs();
studs obj=new studs(str1);
	}

}
