import java.util.Scanner;
class operation
{
 
 void addition(int a,int b) {
  int add;
  add=a+b;
  System.out.println("addition"+add);
 }
 void substract(int a,int b)
 {
  int sub;
  sub=a-b;
  System.out.println("substraction"+sub);
 }
 void multiple(int a,int b)
 {
  int mul;
  mul=a*b;
  System.out.println("multiplication"+mul);
  
 }
 void division(int a,int b)
 {
  int div;
  div=a/b;
  System.out.println("division"+div);
 }
}
public class program37_Q4 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int n1,n2;
  Scanner sc=new Scanner(System.in);
  operation obj=new operation();
  System.out.println("enter value for a:");
  n1=sc.nextInt();
  System.out.println("enter the value for b");
  n2=sc.nextInt();
  obj.addition(n1, n2);
  obj.substract(n1, n2);
  obj.multiple(n1, n2);
  obj.division(n1, n2);
 }
}
