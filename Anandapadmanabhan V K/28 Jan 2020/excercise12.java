import java.util.HashSet;

public class excercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set1 = new HashSet<String>();
	     set1.add("Red");
	     set1.add("Green");
	     set1.add("Black");
	     set1.add("White");
	     System.out.println("Frist HashSet content: "+ set1);
	     HashSet<String>set2 = new HashSet<String>();
	     set2.add("Red");
	     set2.add("Pink");
	     set2.add("Black");
	     set2.add("Orange");
	     System.out.println("Second HashSet content: "+ set2);
	     set1.retainAll(set2);
	     System.out.println("HashSet content:");
	     System.out.println(set1);
	}

}
