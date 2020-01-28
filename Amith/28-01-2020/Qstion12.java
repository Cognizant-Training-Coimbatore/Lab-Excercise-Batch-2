import java.util.TreeSet;

public class Qstion12 {

	public static void main(String[] args) 
	{
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("amith");
		myset.add("arhem");
		myset.add("messi");
		myset.add("ronaldinho");
		System.out.println(myset);
		TreeSet<String>myset2=new TreeSet<String>();
		myset2.add("amith");
		myset2.add("zarhem");
		myset2.add("messi");
		myset2.add("ronaldo");
		System.out.println(myset2);
		myset.retainAll(myset2);
		System.out.println("conetst retained are");
		System.out.println(myset);
		

	}

}
