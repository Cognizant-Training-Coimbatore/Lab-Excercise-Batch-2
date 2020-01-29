package abc;
interface sta
{
	default void display()
	{
		System.out.println("hello");
	}
}
interface tes
{
	default void display()
	{
		System.out.println("hai");
	}
}
class jac implements sta,tes
{
	public void display() {
	sta.super.display();
	tes.super.display();
}}
public class date29_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
jac obj=new jac();
obj.display();
	}

}
