package demo11;
class sample4
{
static int i; //it retains the prev value
void display()
{
i++;
System.out.println(i);
}
}
public class class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample4 obj1=new sample4();
		obj1.display();
		sample4 obj2=new sample4();
		obj2.display();

	}

}
