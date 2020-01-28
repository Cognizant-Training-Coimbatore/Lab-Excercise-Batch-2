import java.util.ArrayList;

public class ex8 {

	public static void main(String[] args) 
	{
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("white");
		mylist.add("black");
		mylist.add("red");
		mylist.add("blue");
		for( String x: mylist)
		{
			System.out.println(x);
		}

	}

}
