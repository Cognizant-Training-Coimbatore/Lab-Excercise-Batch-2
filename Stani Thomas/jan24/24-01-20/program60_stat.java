class static1
{
static int i;
void display()

    {
i++;
System.out.println(i);
}
}
public class program60_stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static1 obj1=new static1();
		obj1.display();
		static1 obj2=new static1();
		obj2.display();
	}

}
