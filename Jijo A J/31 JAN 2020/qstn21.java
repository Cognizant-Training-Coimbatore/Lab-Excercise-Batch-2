import java.util.Arrays;
import java.util.Scanner; 
public class qstn21{
 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int[] my_array=new int[11];
   System.out.println("Enter the elements");
   for(int i=0;i<10;i++)
   {
		   my_array[i] =sc.nextInt();
   }
   
   int position = 2;
   int newValue    = 5;

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }
 