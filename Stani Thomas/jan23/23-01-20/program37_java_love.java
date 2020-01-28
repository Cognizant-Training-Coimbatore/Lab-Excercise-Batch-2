import java.util.Scanner;

class programming
{
	programming()
	{
		System.out.println("I love programming languages");
	}
	programming(String str)
	{
		System.out.println("I love "+str);
	}
}
public class program37_java_love {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner sc=new Scanner(System.in);
System.out.println("do u want to enter anything 1 for yes and 0 for no");
int n=sc.nextInt();
if(n==0)
{
	programming obj=new programming();
}
else
{
	System.out.println("enter string");
	 str1=sc.nextLine();
	 programming obj1=new programming(str1);
	
}
	
	}

}
