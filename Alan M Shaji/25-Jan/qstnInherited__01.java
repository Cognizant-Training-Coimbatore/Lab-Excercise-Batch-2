package packB;
import packA.qstn__01;
public class qstnInherited__01 extends qstn__01{
void display()
{
	System.out.println("inherited variable value\t:\t"+ y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qstnInherited__01 obj=new qstnInherited__01();
		obj.display();

	}

}
