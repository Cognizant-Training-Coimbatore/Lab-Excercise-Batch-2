import java.util.Scanner;
public class program22_oddcount
{
public static void main(String[] args) {
   Scanner in= new Scanner (System.in);
  
   System.out.print("Enter the input strength: ");
   int n = in.nextInt();
   int oddcount = 0;
   int evencount = 0;

   for(int i= 1;i<=n;i++)
   {
       System.out.println("Enter the numbers");
       int numbers= in.nextInt();

       if(numbers %2==0)
       {
           evencount++;
       }
       else if(numbers %2==1)
       {
           oddcount++;
       }
   }
   System.out.println("There are: "+oddcount+" odd numbers");
   System.out.println("There are :"+evencount+" even numbers");

       }

   }