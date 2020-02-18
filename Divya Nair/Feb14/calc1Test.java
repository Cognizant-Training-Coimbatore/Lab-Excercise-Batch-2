package repository;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import repository.calc1;

public class calc1Test {
	//Annotation

  @Test
  public void addNumbersTest()
  {
	 calc1 obj=new calc1();
	 int a=2,b=2,exoutput=4,actoutput;
	 actoutput=obj.addNumbers(a,b);
	 assertEquals(exoutput,actoutput);
  }
}
 