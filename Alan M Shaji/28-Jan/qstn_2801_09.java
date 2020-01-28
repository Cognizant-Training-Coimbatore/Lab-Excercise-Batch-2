import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
		 
public class qstn_2801_09 {
	public static void main(String[] args) {
		LinkedList<String> linked_list = new LinkedList<String>();
		linked_list.add("Red");
		linked_list.add("Green");
		linked_list.add("Black");
		linked_list.add("White");
		linked_list.add("Pink");
		Scanner sc=new Scanner(System.in);
		System.out.print("enter pos\t:\t");
		int a=sc.nextInt();
   	   Iterator p = linked_list.listIterator(a);
	   while (p.hasNext()) {
		   System.out.println(p.next());
		   }
		}
		
	}

