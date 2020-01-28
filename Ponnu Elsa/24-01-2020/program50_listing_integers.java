import java.util.Scanner;

public class program50_listing_integers 
{

    public static void main(String[] args) 
    {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first integer:");
    int first = s.nextInt();
    System.out.print("Enter the second integer:");
    int second = s.nextInt();
 
    {
        System.out.println("The integers are : " );

        
        for (int i = first + 1; i < second; i++)
            System.out.print(i + " ");
    }
    
 }
}