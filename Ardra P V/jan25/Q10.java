package packA;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, temp;
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
      System.out.println("Smallest number is : " +num[0]);
     
	}

}
