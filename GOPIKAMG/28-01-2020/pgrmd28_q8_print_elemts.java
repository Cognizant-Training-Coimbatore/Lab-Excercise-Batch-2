import java.util.ArrayList;
import java.util.List;

public class pgrmd28_q8_print_elemts {

	public static void main(String[] args) 
	{
		List<String>a1=new ArrayList<String>();
		a1.add("java");
		a1.add("css");
		a1.add("php");
		a1.add("html");
		System.out.println("original elements " +a1);
		int n=a1.size();
		System.out.println("printing the elements according to the index");
		for(int i=0;i<n;i++)
		{
			System.out.println(a1.get(i));
		}

	}

}
