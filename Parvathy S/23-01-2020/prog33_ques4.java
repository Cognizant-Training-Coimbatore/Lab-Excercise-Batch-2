import java.util.Scanner;

public class prog33_ques4 {

   public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        

      
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division    = num1 / num2;
       
       
        System.out.println("Sum of two numbers is : "         + addition);
        System.out.println("Difference of two numbers is : "  + subtraction);
        System.out.println("Product of two numbers is : "     + multiplication);
        System.out.println("Quotient of two number is : "    + division);
       
    }
}
