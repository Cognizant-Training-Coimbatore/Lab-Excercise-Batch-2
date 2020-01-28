import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice_Q4 
{

	public static void main(String[] args) 
	{
		
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		
		  System.out.println(list_Strings);
		
		  int r;
			Scanner scanner = new Scanner(System.in);
			System.out.println("index of the element to be retrieved: ");
			r= scanner.nextInt();
		  
		  String element = list_Strings.get(r);
		  System.out.println("Retrieved element: "+element);
		  
	}

}
