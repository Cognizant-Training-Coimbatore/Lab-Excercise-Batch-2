import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 
import java.util.TreeSet; 
  
public class question42
{ 
  
    public static void main(String[] args) 
    { 
        Set<String> setobj = new HashSet<>(); 
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
   				setobj.add(p);
   			}
   		}
        System.out.println("HashSet: "+ setobj); 
        Set<String> hashSetToTreeSet = new TreeSet<>(setobj);  
        System.out.println("TreeSet: " + hashSetToTreeSet); 
        input.close();
    } 
} 