package pom;

import org.testng.annotations.Test;

public class test_priority {
  @Test(priority = 3)
  public void arun() {
	  System.out.println("arun");
  }
  @Test(priority = 2)
  public void appu() {
	  System.out.println("appu");
  }
  @Test(priority = 1)
  public void zuzu() {
	  System.out.println("zuzu");
  }
}
