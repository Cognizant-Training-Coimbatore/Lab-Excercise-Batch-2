package feb_14_pgms;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import feb_14_pgms.calc;

public class calcTest {
	//Annotation
  @Test
  public void addNumbersTest()
  {
	  calc obj=new calc();
	  int a=2,b=2,expoutput=4,actoutput;
	  actoutput=obj.addNumbers(a,b);
	  assertEquals(actoutput, expoutput);

  }
}
