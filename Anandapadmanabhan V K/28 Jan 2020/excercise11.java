import java.util.LinkedList;
import java.util.Scanner;

public class excercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(100);
		list.add(222);
		list.add(333);
		list.add(444);
		System.out.println("The list is " + list);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positions of elements to be swapped");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Integer first_element = list.get(x);
		list.set(x,list.get(y));
		list.set(y,first_element);
		    
		    System.out.println("The new list is" + list); 
	}

}
