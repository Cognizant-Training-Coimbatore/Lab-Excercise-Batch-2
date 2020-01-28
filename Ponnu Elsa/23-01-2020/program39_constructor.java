class constr_overl
{
	constr_overl()
	{
		System.out.println("Unknown");
	}
	constr_overl(String str)
	{
		System.out.println(str);
	}
}
public class program39_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constr_overl obj=new constr_overl();
		constr_overl obj1=new constr_overl("Paru Dona");

	}

}
