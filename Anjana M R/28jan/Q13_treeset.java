
import java.util.TreeSet;

public class Q13_treeset {

	public static void main(String[] args) {
		
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("Red");
		t1.add("orange");
		t1.add("yellow");
		t1.add("green");
		t1.add("blue");
System.out.println("First treeset  :"+t1);
     TreeSet<String> t2=new TreeSet<String>();
       t2.add("orange");
       t2.add("blue");
       t2.add("violet");
       t2.add("green");
       t2.add("white");
       System.out.println("Second treeset   :"+t2);
       t1.addAll(t2);
       System.out.println("Added elements  :"+t1);
	}

}
