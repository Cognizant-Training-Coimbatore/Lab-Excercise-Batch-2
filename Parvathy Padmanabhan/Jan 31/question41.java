import java.util.*; 
  
public class question41
{ 
    public static void main(String args[]) 
    { 
        HashSet<String> element = new HashSet<String>(); 
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
   				element.add(p);
   			}
   		}

        System.out.println("The HashSet: " + element); 
        Object[] arr = element.toArray(); 
        System.out.println("The array is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
        input.close();
    } 
} 