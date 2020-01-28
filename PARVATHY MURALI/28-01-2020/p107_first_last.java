import java.util.ArrayList;

public class p107_first_last {

	public static void main(String[] args) {
		ArrayList<String> map1=new ArrayList<String>();
		map1.add("one");
		map1.add("two");
		map1.add("three");
		map1.add("four");
		map1.add("six");
		map1.add("five");
		map1.add("six");
		System.out.println("first index of six:"+map1.indexOf("six"));
		System.out.println("last index of six:"+map1.lastIndexOf("six"));

	}

}
