import java.util.ArrayList;
import java.util.List;

public class prog108_ex1_arraylist 
{

	public static void main(String[] args) 
	{
		
	List<String>a1=new ArrayList<String>();
	a1.add("red");
	a1.add("blue");
	a1.add("green");
	a1.add("yellow");
	
	for(String s:a1)
	{
		System.out.println(s);
	}
}

}
