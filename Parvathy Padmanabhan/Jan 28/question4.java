import java.util.HashMap;
import java.util.Scanner;
public class question4
{

	public static void main(String[] args) {
		HashMap<Integer,String> myset = new HashMap<Integer,String>();
		Scanner input= new Scanner(System.in);
		String p;
		int i=0;
		System.out.println("Press 1 to stop entering");
		for(;;)
		{
			p = input.next();
			if(p.equals("1"))
			{
				break;
				
			}
			else
			{
				myset.put(i,p);
				i++;
			}
		}
			System.out.println("Enter position:");
			i=input.nextInt();
			System.out.println("Element in "+i+ " position is " + myset.get(i-1));
			input.close();
	}
}


