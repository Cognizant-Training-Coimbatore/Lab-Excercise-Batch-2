import java.util.Scanner;

public class Q5_program_5_marks {
	static void validate() throws myexceptions
	{
	Scanner sc=new Scanner(System.in);
int m;
System.out.println("Enter the mark");
m=sc.nextInt();
if(m<0)
{
	throw new myexceptions("invalid");
}
else
{
	System.out.println("Marks:"+m);
}
	}
	public static void main(String[] args) {
		try
		{
			validate();
		}
		catch(Exception e)
		{
			System.out.println("Error occured"+e);
		}

	}

}
