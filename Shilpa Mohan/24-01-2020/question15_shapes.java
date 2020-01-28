class Shape
{
void dis1()
{
System.out.println("This is shape");
}
}
class rectangle extends Shape
{
void dis2()
{
System.out.println("This is rectangular");
}
}
class square extends rectangle
{
void dis4()
{
System.out.println("Square is a rectangle");
}
}
class circle extends Shape
{
void dis3()
{
System.out.println("This is circle");
}
}
public class question15_shapes {

public static void main(String[] args) {
square ob=new square();
ob.dis1();
ob.dis2();
}

}