class AddTwoNos
{
int c;
int add(int a, int b)
{
c=a+b;
return c;
}
}
public class JavaDemo
{
public static void main(String a[])
{
AddTwoNos a1 = new AddTwoNos();
int d = a1.add(10,20);
System.out.println("The Addition of two nos is " + d);
}
}