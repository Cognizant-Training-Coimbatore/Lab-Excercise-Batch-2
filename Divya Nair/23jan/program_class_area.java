import java.util.Scanner;

class Area
{
	int length;
	int breadth;
	
	void values()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		length=scan.nextInt();
		System.out.println("Enter the breadth");
		breadth=scan.nextInt();
		
		
		
	}
	void returnArea()
	{
		System.out.println("Area is:" +length*breadth);
	}
}
public class program_class_area {

	public static void main(String[] args) 
	{
		Area obj=new Area();
		obj.values();
		obj.returnArea();

	}

}
