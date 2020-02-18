package blaa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class webtest1 {
  @Test
  public void testcase1() {
	  System.out.println("test is under execution");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test is running");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test is running");
  }

}
