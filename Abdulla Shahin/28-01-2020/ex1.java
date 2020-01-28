import java.util.ArrayList;
import java.util.List;

public class ex1 
{
	public static void main(String[] args) 
	{
		List<String> color=new ArrayList<String>();
		color.add("blue");
		color.add("red");
		color.add("orange");
		color.add("pink");
		for(String s:color)
		{
			System.out.println(s);
		}

	}

}