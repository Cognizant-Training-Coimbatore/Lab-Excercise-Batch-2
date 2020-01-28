import java.util.LinkedList;
import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(1);
		list.add(2);
		System.out.println(list);
		System.out.println("Enter values to swapped: ");
		int b=sc.nextInt();
		int c=sc.nextInt();
		for(int i=0;i<6;i++)
		{
			int f=list.get(i);
			if(f==b)
			{
				list.set(i,c);
			}
			else if(f==c)
			{
				list.set(i,b);
			}
		}
		System.out.println(list);

	}

}
