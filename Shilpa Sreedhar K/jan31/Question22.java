package jan31;

import java.util.Arrays;

public class Question22 {

    static void rearrange(int[] arr, int n) 
     { 
     int temp[] = new int[n]; 
     int small=0, large=n-1;
     boolean flag = true; 
     for (int i=0; i<n; i++) 
     { 
         if (flag) 
             temp[i] = arr[large--]; 
         else
             temp[i] = arr[small++]; 
   
         flag = !flag; 
     } 
   arr = temp.clone(); 
 } 
 public static void main(String[] args)  
 { 
     int arr[] = new int[]{1, 2, 3, 4, 5, 6}; 
       
     System.out.println("Original Array "); 
     System.out.println(Arrays.toString(arr)); 
       
     rearrange(arr,arr.length); 
       
     System.out.println("Modified Array "); 
     System.out.println(Arrays.toString(arr)); 
     
 } 

}
