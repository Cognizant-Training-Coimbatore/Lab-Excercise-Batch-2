package packagee;

import java.util.TreeSet;

public class program13_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("smmm");
		myset.add("ammu");
		myset.add("annnu");
		myset.add("kesh");
		
		TreeSet<String>myset2=new TreeSet<String>();
		myset2.add("aaa");
		myset2.add("ddd");
		myset2.add("hhhh");
		myset2.add("cccc");
		myset.addAll(myset2);
		System.out.println(myset);

	}

}
