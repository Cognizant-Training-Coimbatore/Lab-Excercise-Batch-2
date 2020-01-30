package set_7;
abstract class cl1
{
int a =10,b=10;
abstract void meth1();
abstract void meth2();

}
class m1 extends cl1
{
void meth1() {
System.out.println("Method1 : adding given values :"+(a+b));
}
void meth2() {
System.out.println("Method2 : subtracting given values :"+ (a-b));
}
}
public class qn_6 {

public static void main(String[] args) {
m1 ob = new m1();
ob.meth1();
ob.meth2();

}

}

