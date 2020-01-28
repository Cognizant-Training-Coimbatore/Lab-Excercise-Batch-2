import java.util.ArrayList;
import java.util.Scanner;
  public class Q7
  {
    public static void main(String[] args)
    {
  ArrayList<String>  color = new ArrayList<String>();

  color.add("Blue");
  color.add("Green");
Scanner sc =new Scanner(System.in);
  System.out.println("Original array list: " + color);
  System.out.println("Replace Green with ?");
 String a1=sc.nextLine();
  color.set(1,a1);

  System.out.println(color);
  }
}