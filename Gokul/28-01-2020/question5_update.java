import java.util.ArrayList;
import java.util.Scanner;

public class question5_update {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(78);
		a.add(89);
		a.add(100);
		a.add(90);
		a.add(83);
		a.add(76);
		a.add(6);
		a.add(9);
		System.out.println("Elements of the arraylist are "+a);
		System.out.println("Enter the index of the element");
		Scanner sc= new Scanner(System.in);
		int index=sc.nextInt();
		System.out.println("Enter the replacement number ");
		int number=sc.nextInt();
		a.set(index,number);
		System.out.println("The new arraylist is "+a);

	}

}
