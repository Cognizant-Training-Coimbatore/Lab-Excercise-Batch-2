import java.util.Scanner;

class Programming
{
	String name1;
public void case1()
{
	System.out.println("I love programming..");
}
public void case2(String name)
{
	name1=name;
	System.out.println("I love programming "+name1);

}
}
public class program38_Question8 {

	public static void main(String[] args) {
		Programming pgm=new Programming();
		String name="Java";
		pgm.case1();
		pgm.case2(name);

	}

}
