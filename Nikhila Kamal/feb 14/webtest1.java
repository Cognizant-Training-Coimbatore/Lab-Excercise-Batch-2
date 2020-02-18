package feb_14_pgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class webtest1 {
  @Test
  public void testcase1()
  {
	  System.out.println("Test is under execution");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before test is running");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test is running");
  }

}
