import java.util.TreeSet;

public class prgd28_q13_treeset {

	public static void main(String[] args)
	{
		TreeSet <String> t1=new TreeSet<String>();
		t1.add("red");
		t1.add("yellow");
		t1.add("pink");
		t1.add("violet");
		t1.add("green");
		System.out.println("The first set elements are "+t1);
		TreeSet <String> t2=new TreeSet<String>();
		t2.add("java");
		t2.add("cpp");
		t2.add("selenium");
		t2.add("c++");
		System.out.println("The second set elements are "+t2);
		t1.addAll(t2);
		System.out.println("the final set contains" +t1);
		
		
		
		

	}

}
