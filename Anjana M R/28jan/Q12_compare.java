import java.util.HashSet;

public class Q12_compare {

	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("orange");
		h1.add("yellow");
		h1.add("green");
		h1.add("blue");
System.out.println("First hashset  :"+h1);
     HashSet<String> h2=new HashSet<String>();
       h2.add("orange");
       h2.add("blue");
       h2.add("violet");
       h2.add("green");
       h2.add("white");
       System.out.println("Second Hashset   :"+h2);
       h1.retainAll(h2);
       System.out.println("Hashset   :"+h1);
       
	}

}
