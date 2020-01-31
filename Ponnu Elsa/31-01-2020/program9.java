public class program9 {
 public static void main(String[] args)
 {
    int sum = 1;
	 int k = 0; 
	 int n = 0; 
    	
		while (k < 100) {
			n++; 
			if (n % 2 != 0) { 
			// check if the number is even
				if (is_Prime(n)) {
					sum += n; 					
				}
			}
                    k++; 	
		}
		System.out.println("\nSum of the prime numbers till 100: "+sum); 	
	 }
	
   	public static boolean is_Prime(int n) {
		for (int i = 3; i * i <= n; i+= 2) {
			if (n % i == 0) {
				return false; 
			}
		}
		return true;
	}
}