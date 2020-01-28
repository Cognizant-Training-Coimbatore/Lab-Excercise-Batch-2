import java.util.HashSet;

public class retain_hashset {

	public static void main(String[] args) 
	{
		HashSet<String> hsh1=new HashSet<String>();
		hsh1.add("red");
		hsh1.add("blue");
		hsh1.add("white");
		hsh1.add("yellow");
		hsh1.add("pink");
		System.out.println("The first set of elements are:"+hsh1);
		HashSet<String> hsh2=new HashSet<String>();
		hsh2.add("violet");
		hsh2.add("red");
		hsh2.add("yellow");
		hsh2.add("indigo");
		hsh2.add("orange");
		System.out.println("The second set of elements are:"+hsh2);
		
		hsh1.retainAll(hsh2);
		
		System.out.println("Hashset content:");
		System.out.println(hsh1);
	}

}
