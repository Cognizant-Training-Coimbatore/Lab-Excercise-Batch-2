import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class question18 {

	public static void main(String[] args) 
	{
		HashMap <Integer, Integer> list = new HashMap <Integer, Integer>();
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
		int max =Collections.max(list.keySet());
		int min = Collections.min(list.keySet());
		System.out.println(list.get(max) +"  "+ list.get(min));
		input.close();
	}

}
