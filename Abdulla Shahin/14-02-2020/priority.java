package pom;

import org.testng.annotations.Test;

public class priority
{
  @Test(priority = 2)
  public void banana() 
  {
	  System.out.println("banana");
  }
  @Test(priority = 1)
  public void apple() 
  {
	  System.out.println("apple");
  }
  @Test(priority =3)
  public void cat() 
  {
	  System.out.println("cat");
  }
}
