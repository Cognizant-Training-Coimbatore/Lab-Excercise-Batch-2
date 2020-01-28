import java.util.ArrayList;
import java.util.Scanner;

public class ex5 
{
	public static void main(String[] args) 
	{
		ArrayList<String>List1=new ArrayList<String>();
		List1.add("green");		
		List1.add("yellow");		
		List1.add("red");	
		List1.add("blue");		
		Scanner sc=new Scanner(System.in);		
		int y;		
		System.out.println("Enter the element and position :");	
		String x=sc.nextLine();		
		y=sc.nextInt();		
		List1.add(y, x);		
		System.out.println(List1);
	}
}