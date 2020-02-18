import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() throws Exception {
	  int j;
	  for(j=1;j<50;j++)
		  
	  {
		  System.out.println("The value of i is"+j);
		  Thread.sleep(2000);
	  }
  }
}
