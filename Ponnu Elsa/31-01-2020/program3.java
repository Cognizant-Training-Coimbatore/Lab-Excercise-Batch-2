import java.util.Scanner;
public class program3{
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the  side of the hexagon: ");
        double s = input.nextDouble();
        System.out.print("The area of the hexagon is: " + area(s)+"\n");
    }
    public static double area(double s) {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
    }
}