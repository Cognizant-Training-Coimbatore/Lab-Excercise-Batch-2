import org.testng.annotations.Test;

public class test1 {
  @Test
  public void f() throws InterruptedException 
  {
	  
	  //System.out.println("Test1 is running");
	  int i;
	  for(i=1;i<50;i++)
	  {
		  System.out.println("The value of i is "+i);
		  Thread.sleep(2000);
	  }
  }
}
