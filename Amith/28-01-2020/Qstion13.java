import java.util.TreeSet;

public class Qstion13 {

	public static void main(String[] args) 
	{
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("amith");
		myset.add("zarhem");
		myset.add("messi");
		myset.add("ronaldo");
		TreeSet<String>list=new TreeSet<String>();
		list.add("abc");
		list.add("zxs");
		list.add("gsh");
		list.add("yts");
		list.add("hgj");
		list.add("cax");
		myset.addAll(list);
		System.out.println(myset);

	}

}
