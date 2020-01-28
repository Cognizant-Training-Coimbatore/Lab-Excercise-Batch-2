import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Qstion15 {

	public static void main(String[] args) {
		TreeSet<Integer>list=new TreeSet<Integer>();
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(99);
		list.add(55);
		list.add(1);
		System.out.println(list);
		Iterator it1=list.iterator();
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			int a=(int) obj;
			if(a>=n)
			{
				System.out.println(a);
			}
		}

	}

}
