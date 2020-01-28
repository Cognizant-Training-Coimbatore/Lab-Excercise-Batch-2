class Area1
{
 void ar(int l,int b)
 {
  int rec=l*b;
  System.out.println("area of rectangle"+rec);
 }
 void ar(int a)
 {
  int sq=a*a;
  System.out.println("area of square"+sq);
 }
}
public class prg42_Q10 
{
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Area1 obj=new Area1();
  obj.ar(12,2);
  obj.ar(9);
 }
}
