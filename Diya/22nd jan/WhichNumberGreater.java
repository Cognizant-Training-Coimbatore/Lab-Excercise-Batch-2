import  java.util.Scanner;
class WhichNumberGreater
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter one number");
int a = sc.nextInt();
System.out.println("Enter another number");
int b = sc.nextInt();
if(a>b)
  {
    System.out.println(+a+ "is greater");
   }
else
   {
     System.out.println(+b+ "is greater");

   }
}
}