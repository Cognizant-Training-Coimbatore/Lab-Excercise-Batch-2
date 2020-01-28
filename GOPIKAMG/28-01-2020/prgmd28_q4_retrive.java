import java.util.ArrayList;
import java.util.List;

public class prgmd28_q4_retrive {

	public static void main(String[] args) 
	{
		List<String>a1=new ArrayList<String>();
		a1.add("java");
		a1.add("css");
		a1.add("php");
		a1.add("html");
		a1.add(3,"dotnet");
		System.out.println("second element is " +a1.get(1));

	}

}
