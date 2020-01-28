class stringhandler
{
 //String n;
 void transform(String str)
 {
  int len=str.length();
  System.out.println("length of string"+len);
  System.out.println("string:"+str.toLowerCase());
 }
}
public class prg43_Q5 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  stringhandler obj=new stringhandler();
  obj.transform("Greety");
 }
}

