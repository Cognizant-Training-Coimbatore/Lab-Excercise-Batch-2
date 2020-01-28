import java.util.ArrayList;
import java.util.Iterator;
public class ex2
{
	public static void main(String[] args) 
	{
		ArrayList myset=new ArrayList();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("per1");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
	}
}