import java.util.Scanner;

class Area
{
	int length,breadth;
	void accept()
	{
		System.out.println("Enter the length of rectangle");
		Scanner scanner = new Scanner(System.in);
		length = scanner.nextInt();
		System.out.println("Enter the breadth of rectangle");
		
		breadth = scanner.nextInt();
		
		
	}
	void return_area()
	{
		
		System.out.println("The area of rectangle is :" + length*breadth);
	}
	
}

public class program43_area {

	public static void main(String[] args) {
		Area obj= new Area();
		obj.accept();
		obj.return_area();
	
		// TODO Auto-generated method stub

	}

}
