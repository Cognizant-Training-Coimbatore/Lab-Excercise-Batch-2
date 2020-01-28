import java.util.HashSet;

public class pgm28_q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Apple");
		hs1.add("Orange");
		hs1.add("Mango");
		hs1.add("Grapes");
		hs1.add("Banana");
		System.out.println("First Set:"+hs1);
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("Watermelon");
		hs2.add("Orange");
		hs2.add("Mango");
		hs2.add("Guava");
		hs2.add("Banana");
		System.out.println("Second Set:"+hs2);
		hs1.retainAll(hs2);
		System.out.println(hs1);
	}
		
	}


