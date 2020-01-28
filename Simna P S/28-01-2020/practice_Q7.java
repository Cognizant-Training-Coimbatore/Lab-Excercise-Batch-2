import java.util.ArrayList;
import java.util.Scanner;

public class practice_Q7 
{

	public static void main(String[] args) 
	{
		 ArrayList<String>  color = new ArrayList<String>();

		  color.add("Red");
		  color.add("Green");
		  color.add("Black");
		  System.out.println("Original array list: " + color);
		  
		  String new_color = "White";
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the element to be added: ");
		  new_color = scanner.next();
		  color.set(1,new_color);

		 
		  System.out.println(color);

	}

}
