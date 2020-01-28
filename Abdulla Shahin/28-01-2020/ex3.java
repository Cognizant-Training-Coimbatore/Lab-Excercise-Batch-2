import java.util.ArrayList;
public class ex3 
{
	public static void main(String[] args) 
	{
		ArrayList<String>List1=new ArrayList<String>();
		List1.add("yellow");
		List1.add("violet");
		List1.add("green");
		List1.add("blue");
		System.out.println(List1);
		List1.add(0,"red");
		System.out.println(List1);
	}
}