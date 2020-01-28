import java.util.Scanner;

public class program50_listing_integers_vv
{

    public static void main(String[] args) 
    {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first integer:");
    int first = s.nextInt();
    System.out.print("Enter the second integer:");
    int second = s.nextInt();
 
    if (second > first) 
    {
        System.out.println("The integers are : " );

        
        for (int i = first + 1; i < second; i++)
            System.out.print(i + " ");
    }
    else 
    {
      
        System.out.println("The integers are : " );

       
        for (int i = second + 1; i < first; i++)
            System.out.print(i + " ");
    }
 }
}