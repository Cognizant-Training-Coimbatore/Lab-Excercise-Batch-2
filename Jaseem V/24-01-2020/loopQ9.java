import java.util.Scanner;
import java.util.Random; 
public class loopQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="y";
		
		// create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
         
while(ch.equals("y")) 
{
	int rand_m = rand.nextInt(1000);
	System.out.println(rand_m);
		System.out.println("Do you want to generate a Random number (y/n)?");
Scanner sc=new Scanner(System.in);
ch=sc.nextLine();
	}

	}}