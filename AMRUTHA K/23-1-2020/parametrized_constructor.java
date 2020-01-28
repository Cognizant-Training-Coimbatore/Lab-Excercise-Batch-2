package demo;
class calc{int a,b;
calc(int x,int y){
	a=x;
	b=y;
	
}
void sumofNumbers()
{System.out.println(a+b);
	
	
}}
public class parametrized_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc(5,10);//while declaring the objects we pass the value in parametrized constructor.
		obj.sumofNumbers();
		

	}

}
