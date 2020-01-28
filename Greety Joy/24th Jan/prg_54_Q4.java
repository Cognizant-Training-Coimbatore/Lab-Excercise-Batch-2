import java.util.Scanner;
public class prg_54_Q4
{
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int answer=7,i,n;
  for(i=3;i>0;i--)
  {
   System.out.print("I am thinking about anumber b/w 0 and 9.can u guess it("+i+"attempt(s) left)");
   n=sc.nextInt();
   if(n==answer)
   {
    System.out.println("success");
    break;
   }
   else
    System.out.println("sorry wrong number.");
  }
  if(i==0)
  {
  System.out.println("sorry.wrong number .correct answer is"+answer);
  }
 }
}
