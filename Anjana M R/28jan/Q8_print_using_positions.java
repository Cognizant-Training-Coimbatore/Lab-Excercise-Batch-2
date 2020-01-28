import java.util.ArrayList;

public class Q8_print_using_positions {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>(5);
		str.add("yellow");
		str.add("orange");
		str.add("red");
		str.add("blue");
		str.add("green");
		int n=str.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(i+"  "+str.get(i));
			
		}

	}

}
