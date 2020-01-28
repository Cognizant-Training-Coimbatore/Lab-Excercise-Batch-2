import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Qstion9 {

	public static void main(String[] args) 
	{
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(12);
		list.add(13);
		list.add(23);
		list.add(32);
		list.add(11);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		Iterator it1=list.listIterator(n);
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}

	}

}
