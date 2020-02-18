import org.testng.annotations.Test;

public class test1 {
  @Test
  public void f()
  {
	  int i;
	  for(i=1;i<50;i++)
	  {
		  System.out.println("the value of i is "+i);
		  Thread.sleep(2000);
	  }
	  System.out.println("Test 1 ia running....");
  }
}
