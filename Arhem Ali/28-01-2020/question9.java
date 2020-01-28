import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> myset=new LinkedList<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		System.out.println("Enter position");	
		int f=sc.nextInt();
		Iterator it1=myset.listIterator(f-1);
		while(it1.hasNext()) 
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
	}

}
