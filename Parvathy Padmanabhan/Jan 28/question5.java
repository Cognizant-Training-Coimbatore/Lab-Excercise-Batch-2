import java.util.HashMap;
import java.util.Scanner;
public class question5{

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
			System.out.println("Enter position to be replaced:");
			i=input.nextInt();
			System.out.println("Enter element to be replaced:");
			p=input.next();
			System.out.println("Before updating : " + myset);
			
			for(int j=myset.size()-1;j>=i-1;j--)
			{
				myset.put(j+1,myset.get(j));
			}
			myset.put(i-1,p);
			System.out.println("After updating : " + myset);
			input.close();
	}
}


