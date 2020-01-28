package j25_q2_superclass;

class anim{
	void anim() {
	
		System.out.println("d1");
	}
}

public class superClass extends anim
{ 
	void anim() 
	{
	
	System.out.println("d2");
    }
	protected superClass(){
		super.anim();
		anim();
		
		//System.out.println("The value of x and y is : "+ x+ " "+y );
		
		
	}
 
}

