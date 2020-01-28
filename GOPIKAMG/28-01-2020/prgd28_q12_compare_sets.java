import java.util.HashSet;

public class prgd28_q12_compare_sets {

	public static void main(String[] args)
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("red");
		h1.add("orange");
		h1.add("violet");
		System.out.println("First set elements " +h1);
		HashSet<String> h2=new HashSet<String>();
		h2.add("java");
		h2.add("orange");
		h2.add("Selenium");
		h2.add("red");
		System.out.println("second  set elements " +h2);
		h1.retainAll(h2);
		System.out.println("the elemnts which are same");
		System.out.println(h1);
		
		

	}

}
