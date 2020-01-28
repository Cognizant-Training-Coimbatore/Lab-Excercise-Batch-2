import java.util.ArrayList;
import java.util.List;

public class prog_pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
        System.out.println("An element at 2nd position: "+a1.get(2));
        for(String s:a1)
        {
        	System.out.println(s);
        }
	}

}
