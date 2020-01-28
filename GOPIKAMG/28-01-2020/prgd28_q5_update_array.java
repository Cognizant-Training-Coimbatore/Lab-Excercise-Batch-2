import java.util.ArrayList;
import java.util.List;

public class prgd28_q5_update_array {

	public static void main(String[] args)
	{
		List<String>a1=new ArrayList<String>();
		a1.add("java");
		a1.add("css");
		a1.add("php");
		a1.add("html");
		System.out.println(a1);
		a1.set(2, "cpp");
		System.out.println("After replacement");
		System.out.println(a1);

	}

}
