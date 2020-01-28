import java.util.Scanner;
public class a25_1 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String names[] = new String[5];
  int i;
  for(i=0;i<=4;i++)
  {
   System.out.println("Enter the names:");
   names[i]=sc.nextLine();
   names[i]=names[i].toUpperCase();
  }
  System.out.println("Elements of array are " +names[0]);
  System.out.println("Elements of array are " +names[1]);
  System.out.println("Elements of array are " +names[2]);
  System.out.println("Elements of array are " +names[3]);
  System.out.println("Elements of array are " +names[4]);
  
 }
}
