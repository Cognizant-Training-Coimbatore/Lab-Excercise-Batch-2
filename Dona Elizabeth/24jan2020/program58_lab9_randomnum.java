import java.util.Scanner;

public class program58_lab9_randomnum {

	public static void main(String[] args) {
		int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }
	}

}
