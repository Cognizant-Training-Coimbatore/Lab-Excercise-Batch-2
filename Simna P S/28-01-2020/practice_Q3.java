import java.util.Arrays;
import java.util.Scanner;

public class practice_Q3 
{

	public static void main(String[] args) 
	{

		   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		    // Insert an element in 3rd position of the array (index->2, value->5)
		   int r;
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the number to be inserted: ");
			r= scanner.nextInt();
		   int Index_position = 0;
		   int newValue    = r;

		  System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		  for(int i=my_array.length-1; i > Index_position; i--){
		    my_array[i] = my_array[i-1];
		   }
		   my_array[Index_position] = newValue;
		   System.out.println("New Array: "+Arrays.toString(my_array));

	}

}
