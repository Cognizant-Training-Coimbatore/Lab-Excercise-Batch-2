import java.util.Random;
import java.util.Scanner;

public class questn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange;
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
