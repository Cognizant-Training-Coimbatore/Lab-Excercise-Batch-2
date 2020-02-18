import org.testng.annotations.Test;

public class test2 {
  @Test
  public void f()
  {
	  int j;
	  for(j=1;j<50;j++)
	  {
		  System.out.println("the value of j is "+j);
		  Thread.sleep(2000);
	  }
	  
	  
	  System.out.println("Test 2 is running");
  }
}
