import java.util.ArrayList;
import java.util.List;

public class p85_diff_for {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("add");
		al.add("sub");
		al.add("mul");
		al.add("div");
		System.out.println("An element at 2nd position:"+al.get(2));
		for(String s:al)
		{
			System.out.println(s);
		}
		
	

	}

}
