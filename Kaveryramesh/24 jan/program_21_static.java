package demo;
class sample4
{//      int i; non static,out will be 1,1 
    static int i;
    void display()
    {     i++;
    	System.out.println(i);
    }
}


public class program_21_static {

	public static void main(String[] args) {
	    
            sample4 obj1=new sample4();
            obj1.display();
            sample4 obj2=new sample4();
            obj2.display();
	}

}
