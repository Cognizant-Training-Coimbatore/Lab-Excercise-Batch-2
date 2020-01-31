package jan31;

import java.util.Arrays;

public class Q22 {

	
		// TODO Auto-generated method stub
		static void rearrange(int[] arr, int n) 
	    { 
	        // Auxiliary array to hold modified array 
	        int temp[] = new int[n]; 
	      
	        // Indexes of smallest and largest elements 
	        // from remaining array. 
	        int small=0, large=n-1; 
	      
	        // To indicate whether we need to copy rmaining 
	        // largest or remaining smallest at next position 
	        boolean flag = true; 
	      
	        // Store result in temp[] 
	        for (int i=0; i<n; i++) 
	        { 
	            if (flag) 
	                temp[i] = arr[large--]; 
	            else
	                temp[i] = arr[small++]; 
	      
	            flag = !flag; 
	        } 
	      
	        // Copy temp[] to arr[] 
	        arr = temp.clone(); 
	    } 
	  
	    // Driver method to test the above function 
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
