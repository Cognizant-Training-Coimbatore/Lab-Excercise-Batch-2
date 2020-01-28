import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class exercise28_Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		System.out.println(list1);
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position of elements to be swapped");
		i = sc.nextInt();
		j = sc.nextInt();
		Collections.swap(list1, i, j);
		System.out.println("Linked list after swapping : ");
		System.out.println(list1);
	}

}
