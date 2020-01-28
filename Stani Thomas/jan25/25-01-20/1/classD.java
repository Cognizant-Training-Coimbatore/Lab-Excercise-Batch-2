package packB;
import packA.classA;
public class classD extends classA {
void display()
{
	System.out.println(y);
}
void check()
{
	classD obj=new classD();
	System.out.println(obj.y);
}
}
