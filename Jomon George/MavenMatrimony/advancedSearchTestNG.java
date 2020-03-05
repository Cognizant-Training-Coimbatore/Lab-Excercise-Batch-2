import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;

public class advancedSearchTestNG extends basicSearchTestNG{
	
 
  @Test
  public void f() {
	  
	  driver.navigate().to("https://www.chavaramatrimony.com/quick-serach-mobile.aspx");
	  advancedSearch object = new advancedSearch(driver);
	  
	  object.selectBrideOrGroom("Groom");
	  object.selectAgeFrom("30");
	  object.selectAgeTo("40");
	  object.selectHeightFrom("160");
	  object.selectHeightTo("170");
	  object.selectCommunity("RC Syrian Christian");
	  object.clickSearch();
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException, IOException {
	  
	  TakesScreenshot screen = ((TakesScreenshot)driver);
	  File srcFile = screen.getScreenshotAs(OutputType.FILE);
	  File DestFile=new File("C:\\Users\\jomon\\Desktop\\CTS\\Training\\Java\\eclipse-workspace\\MavenMatrimony\\screenShots\\sample.jpg");
	  FileUtils.copyFile(srcFile, DestFile);

	  Thread.sleep(3000);
	  driver.quit();
  }

}
