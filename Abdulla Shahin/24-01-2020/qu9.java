import java.util.Random; 

public class qu9 {

	public static void main(String[] args)
	{
		Random rand = new Random(); 
        int x = rand.nextInt(1000); 
        int y = rand.nextInt(1000); 
        System.out.println("Random Integers: "+x); 
        System.out.println("Random Integers: "+y); 
	}

}
