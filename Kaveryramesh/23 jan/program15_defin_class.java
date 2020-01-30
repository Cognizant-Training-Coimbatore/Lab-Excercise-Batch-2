package demo;
class test
{
	
int x;
void assign(int p)
{
   x=p;	
}
void display()
{
	System.out.println(x);
}
}



public class program15_defin_class {

	public static void main(String[] args) {
	
        test obj=new test();
        obj.assign(5);
        obj.display();
	}

}
