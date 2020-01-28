import java.util.LinkedList;

public class question11_Swap {

	public static void main(String[] args) 
	{
		LinkedList<Integer> in=new LinkedList<Integer>();
		in.add(700);
		in.add(600);
		in.add(400);
		in.add(100);
		in.add(250);
		System.out.println("The elements in the list are "+in);
		int swap=in.get(0);
		int a=in.get(1);
		int b=swap;
		swap=a;
		a=b;
		in.set(0, swap);
		in.set(1, b);
		System.out.println("The elements of the list are "+in);
		
		

	}

}
