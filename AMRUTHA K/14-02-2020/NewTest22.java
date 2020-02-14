package pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest22 {
  @Test
  public void f() {
	  
	  
	  System.out.println("test");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {  
	  System.out.println("after test");
	  
  }

}
