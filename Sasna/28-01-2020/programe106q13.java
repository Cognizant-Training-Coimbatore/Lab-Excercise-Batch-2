
import java.util.*; 
  
public class programe106q13 { 
  
    // Function merging two sets using addAll() 
    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) 
    { 
  
        // Creating an empty set 
        Set<T> mergedSet = new HashSet<T>(); 
  
        // add the two sets to be merged 
        // into the new set 
        mergedSet.addAll(a); 
        mergedSet.addAll(b); 
  
        // returning the merged set 
        return mergedSet; 
    } 
  
    public static void main(String[] args) 
    { 
  
        // Creating the sets to be merged 
        // First set 
        Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 })); 
  
        // Second set 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 })); 
  
        // Printing the sets 
        System.out.println("Set a: " + a); 
        System.out.println("Set b: " + b); 
  
        // calling mergeSets() 
        System.out.println("Merged Set: " + mergeSet(a, b)); 
    } 
} 