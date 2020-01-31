import java.util.Scanner;
import java.util.TreeSet;

public class question49 {

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
		System.out.println("First Element  : " +element.lower(i));
		input.close();

	}

}
