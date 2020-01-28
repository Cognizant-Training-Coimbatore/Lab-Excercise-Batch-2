import java.util.Scanner;

class stringm
{
	int numofchar(String a)
	{
		return a.length();
	}
	void lower(String a)
	{
		System.out.println(a.toLowerCase());
	}
}
public class stringquest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringm obj= new stringm();
		String c;
		int length;
		Scanner input=new Scanner (System.in);
		c= input.nextLine();
		length= obj.numofchar(c);
		System.out.println("Output"+ length  );
		 obj.lower(c);
	}

}
