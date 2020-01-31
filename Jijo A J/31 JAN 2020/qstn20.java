import java.util.Arrays;
import java.util.Scanner; 
public class qstn20 {
 
public static void main(String[] args) {
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the element");
   int n = sc.nextInt();
int position=my_array.length;
for(int i =0; i < my_array.length -1; i++)
{
	if(my_array[i]==n)
	{
		position=i;
	}
	}
   for(int i = position; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
   my_array[my_array.length-1]=0;
    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
 }
