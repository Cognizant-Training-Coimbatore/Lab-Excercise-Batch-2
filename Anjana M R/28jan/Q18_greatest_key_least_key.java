import java.util.HashMap;
import java.util.TreeMap;

public class Q18_greatest_key_least_key {

	public static void main(String[] args) {
		
		TreeMap <Integer,String> h1=new TreeMap<Integer,String>();
		h1.put(1,"Orange");
		h1.put(2,"Red");
		h1.put(3,"Blue");
		h1.put(4,"White");
		h1.put(5,"green");
		System.out.println("Greatest key  :"+h1.firstEntry());
		System.out.println("least key  :"+h1.lastEntry());
	}

}
