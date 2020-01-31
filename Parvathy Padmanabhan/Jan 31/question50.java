import java.util.Scanner;
import java.util.TreeSet;

public class question50 {

	public static void main(String[] args) {
		TreeSet<String> element =new TreeSet<String>();
		Scanner input = new Scanner(System.in);
		String s;
		System.out.println("Enter Elements : (Press -1 to exit entering)");
		s= input.nextLine();
		for(;;)
		{
			if(s.contentEquals("-1"))
			{
				break;
			}
			else
			{
				element.add(s);
				s= input.nextLine();
				
			}
		}
		System.out.println("Treeset  : " +element);
		System.out.println("First Element  : " +element.first());
		input.close();
	}
}
