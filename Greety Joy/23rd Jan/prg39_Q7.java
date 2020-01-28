class Addamount
{
 int amount=50;
 Addamount()
 {
  System.out.println("final amount:"+amount);
 }
 Addamount(int a)
 {
  amount=amount+a;
  System.out.println("final amount:"+amount);
 }
}
public class prg39_Q7 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Addamount obj=new Addamount();
  Addamount obj2=new Addamount(750);
  
 }
}
