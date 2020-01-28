import java.util.Scanner;
class area1
{
 int l,b1,side;
 void display(int a,int b)
 {
  Scanner s = new Scanner(System.in);
  System.out.println("enter length");
  l = s.nextInt();
  System.out.println("enter breadth");
  b1 = s.nextInt();
  System.out.println("area of rectangle is : " +l*b1);
 }
 void display(int x)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter side");
  side = sc.nextInt();
  System.out.println("area of square is : " +side*side);
 }
}
public class program_rect {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  area1 obj=new area1();
  obj.display(5,6);
  obj.display(5);
 }
}


