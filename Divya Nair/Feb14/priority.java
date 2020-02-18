package repository;

import org.testng.annotations.Test;

public class priority {
  @Test(priority=1)
  public void banana() 
  {
	  System.out.println("Banana");
  }
  @Test(priority=2)
  public void apple() 
  {
	  System.out.println("Apple");
  }
  @Test(priority=3)
  public void cat() 
  {
	  System.out.println("Cat");
  }
}
