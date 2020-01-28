import java.util.Scanner;

class Stud
{
	
	void display(String name)
	{
		System.out.println(name);
	}
	void display()
	{
		System.out.println("unknown");
	}
}
public class pgm_38_names_of_students {

	public static void main(String[] args) {
		System.out.println("enter the name");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		
		Stud obj=new Stud();
		obj.display(n);
		obj.display();
		

	}

}
