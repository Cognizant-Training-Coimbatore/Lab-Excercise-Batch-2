class AddTwoNos
{
int c;
void add(int a, int b)
{
c=a+b;
System.out.println("The Addition of two nos is " + c);
}
}
public class JavaDemo1
{
public static void main(String a[])
{
AddTwoNos a1 = new AddTwoNos();
a1.add(10,20);
}
}