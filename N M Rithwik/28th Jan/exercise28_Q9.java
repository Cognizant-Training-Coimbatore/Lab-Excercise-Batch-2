import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class exercise28_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position : ");
		i = sc.nextInt();
		Iterator iterator1 = list1.listIterator(i);
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}

}
