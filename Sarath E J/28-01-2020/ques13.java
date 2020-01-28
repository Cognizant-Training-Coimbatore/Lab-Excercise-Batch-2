package hello;


import java.util.TreeSet;

public class ques13 {

	public static void main(String[] args)
	{		TreeSet<String> set = new TreeSet<String>();
	  		set.add("Red");
	        set.add("Green");
	        set.add("Black");
	        set.add("White");
	        System.out.println("Frist HashSet content: "+set);
	        TreeSet<String>set2 = new TreeSet<String>();
	        set2.add("yellow");
	        set2.add("Pink");
	        set2.add("purple");
	        set2.add("Orange");
	        System.out.println("Second HashSet content: "+set2);
	        set.addAll(set2);
	        System.out.println("The new set is : "+set);
	}

}
