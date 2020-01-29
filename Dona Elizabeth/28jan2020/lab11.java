import java.util.LinkedList;
import java.util.List;

public class lab11 {

	public static void main(String[] args) {
		List<String> li=new LinkedList<String>();
		li.add("AA");
		li.add("AB");
		li.add("AC");
		li.add("AD");
		li.add("BB");
		System.out.println("Before swap: "+li);
		String x=li.get(1);
		li.set(1,li.get(3));
		li.set(3,x);
		System.out.println("After swap: "+li);
		
	}

}
