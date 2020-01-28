import java.util.Scanner;

public class prog77_array_seq_search 
{

	public static void main(String[] args) 
	{
		int c,search;

	    Scanner s = new Scanner(System.in);
	    int a[] = new int[10];

	    System.out.println("Enter 10 integers");

	    for (c = 0; c < 10; c++)
	      a[c] = s.nextInt();

	    System.out.println("Enter value to find");
	    search = s.nextInt();

	    for (c = 0; c < 10; c++)
	    {
	      if (a[c] == search)
	      {
	         System.out.println(search + " is present at location " + (c + 1));
	          break;
	      }
	   }
	   if (c == 10)
	      System.out.println(search + " isn't present in array.");
	  }
	


	



	}


