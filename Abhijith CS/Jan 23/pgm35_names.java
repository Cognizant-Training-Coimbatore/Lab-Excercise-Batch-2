import java.util.Scanner;

class Student_name
{
	Student_name()
	{
		System.out.println("Unknown");
	}
	Student_name(String str)
	{
		System.out.println("name: "+str);
	}
}
public class pgm35_names {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.nextLine();
		Student_name sn = new Student_name();
		Student_name sn1 = new Student_name(name);
		sc.close();
	}

}
