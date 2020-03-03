import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyprgmTest {
		Myprgm obj=new Myprgm();
		@Test
		public void testConverttoUpper() {
			String str1= "India";
			String expOutput= "INDIA";
			String actOutput=obj.converttoUpper(str1);
			assertEquals(expOutput, actOutput);
		}
		@Test
		public void testLength() {
			String str2="Selenium";
			int expLength=8;
			int actLength=obj.findLength(str2);
			assertEquals(expLength, actLength);
		}
		@BeforeClass
		public static void startapp()
		{
			System.out.println("Launched");
		}
		@AfterClass
		public static void endapp()
		{
			System.out.println("Closed");
		}
	}

