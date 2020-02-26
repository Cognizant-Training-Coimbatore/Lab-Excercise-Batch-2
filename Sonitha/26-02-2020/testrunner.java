import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestSuite;

public class testrunner 
{

	public static void main(String[] args) 
	{
		
		Result result = JUnitCore.runClasses(testsuite1.class);
		for(Failure failure: result.getFailures())
		{
			System.out.println(failure.toString());
		}
			System.out.println(result.wasSuccessful());
	}

}
