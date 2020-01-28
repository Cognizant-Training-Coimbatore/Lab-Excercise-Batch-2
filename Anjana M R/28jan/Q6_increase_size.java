import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Q6_increase_size {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>(5);
		str.add("yellow");
		str.add("orange");
		str.add("red");
		str.add("blue");
		str.add("green");
		System.out.println(str);
		str.ensureCapacity(10);
		str.add("violet");
		str.add("indigo");
		str.add("white");
		str.add("black");
		str.add("grey");
		System.out.println(str);
		
		

	}

}
