import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class question46 {

	public static void main(String[] args) {
		TreeSet<Integer> element =new TreeSet<Integer>();
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter Elements : (Press -1 to exit entering)");
		a= input.nextInt();
		for(;;)
		{
			if(a==-1)
			{
				break;
			}
			else
			{
				element.add(a);
				a= input.nextInt();
				
			}
		}
		System.out.println("Enter limit:");
		int i=input.nextInt();
		System.out.println("Treeset  : " +element);
		Iterator<Integer> it1=element.iterator();
		while(it1.hasNext())
		{
			int obj= it1.next();
			if(obj<i)
			{
				
			}
			else
			{
				System.out.println(obj);

			}
			
		}
		input.close();

	}

}
