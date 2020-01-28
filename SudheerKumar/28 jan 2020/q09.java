import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class q09 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("yellow");
        list1.add("orange");
        list1.add("maroon red");
        System.out.println("enter the starting index");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ListIterator<String> iterator=list1.listIterator(n);
        while(iterator.hasNext()) {
        	System.out.println(iterator.hasNext());
        }


		
		// TODO Auto-generated method stub

	}

}
