import org.testng.annotations.Test;

public class test2 {
  @Test
  public void f() throws InterruptedException
  {
	 // System.out.println("test2 is running");
	  int j;
	  for(j=1;j<50;j++)
	  {
		  System.out.println("The value of j is "+j);
		  Thread.sleep(2000);
	  }
  }
}
