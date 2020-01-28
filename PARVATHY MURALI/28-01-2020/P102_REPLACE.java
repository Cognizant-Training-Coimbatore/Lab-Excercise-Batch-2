import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P102_REPLACE {

	public static void main(String[] args) {
		List<String> map1=new ArrayList<String>();
		map1.add("one");
		map1.add("two");
		map1.add("three");
		map1.add("four");
		System.out.println("The elements are:"+map1);
		map1.set(2,"TWO");
		System.out.println("The updated elements are:"+map1);

	}

}
