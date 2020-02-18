import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() throws Exception {
	  int i;
	  for(i=1;i<50;i++)
		  
	  {
		  System.out.println("The value of i is"+i);
		  Thread.sleep(2000);
	  }
  }
}
