package Package4;
abstract class Animal {
	  
	  public abstract void animalSound();
	 
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	
	class Pig extends Animal {
	  public void animalSound() {
	   
	    System.out.println("The pig says: wee wee");
	  }
	}


public class program130_set7_q6 {

	public static void main(String[] args) {
		Pig myPig = new Pig(); 
	    myPig.animalSound();
	    myPig.sleep();

	}

}
