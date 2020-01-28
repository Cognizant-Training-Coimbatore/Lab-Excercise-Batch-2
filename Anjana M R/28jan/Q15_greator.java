import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q15_greator {

	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(20);
		t1.add(30);
		t1.add(40);
		t1.add(50);
		t1.add(55);
		t1.add(77);
		t1.add(78);
		t1.add(88);
		t1.add(100);
		Iterator<Integer>i1=t1.iterator();
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		b=sc.nextInt();
		while(i1.hasNext())
		{
			int a=i1.next();
			if(a>=b)
			{
				System.out.println(a);
			}
		}
		
	}

}
