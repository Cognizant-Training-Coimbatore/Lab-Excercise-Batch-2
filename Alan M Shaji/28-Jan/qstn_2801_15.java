import java.util.Scanner;
import java.util.TreeSet;

public class qstn_2801_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(43);
		tree.add(124);
		tree.add(23);
		tree.add(0);
		tree.add(53);
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number\t:\t");
		int a=sc.nextInt();
		System.out.println(tree.ceiling(a));
	
		
		/*
		for(Integer obj:tree)
		{
			if(obj>a)
				System.out.println(obj);
		}
*/
	}

}
