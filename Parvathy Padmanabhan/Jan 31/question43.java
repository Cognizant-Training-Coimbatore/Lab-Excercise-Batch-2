import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class question43
{ 
  public static void main(String[] args) 
  {
     HashSet<String> hset = new HashSet<String>();
     Scanner input= new Scanner(System.in);
     String p;
     for(;;)
		{
			p = input.nextLine();
			if(p.contains("-1"))
			{
				break;
				
			}
			else
			{
				hset.add(p);
			}
		}
     	System.out.println("HashSet contains: "+ hset);
     	List<String> list = new ArrayList<String>(hset);
     	System.out.println("ArrayList contains: "+ list);
     	input.close();
  }
}
