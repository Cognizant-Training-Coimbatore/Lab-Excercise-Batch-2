import java.util.TreeMap;
import java.util.Scanner;
public class question19 {

	public static void main(String[] args) 
	{
		TreeMap <Integer, Integer> list = new TreeMap <Integer, Integer>();
		Scanner input= new Scanner(System.in);
		int p,i;
		System.out.println("Enter first set of elements (Press -1 to stop entering) :");
		
		for(;;)
		{
			System.out.println("Key");
			i=input.nextInt();
			if(i==-1)
			{
				break;
				
			}
			else
			{
				System.out.println("Value");
				p = input.nextInt();
				list.put(i,p);
		
			}
	
		}
		System.out.println(list.firstKey() +"  "+ list.lastKey());
		input.close();
	}

}
