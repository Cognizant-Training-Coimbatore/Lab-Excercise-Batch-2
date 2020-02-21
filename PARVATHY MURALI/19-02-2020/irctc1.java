import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class irctc1
{
	WebDriver driver;
	 ExtentReports reports=new ExtentReports("Report.irctc1.html");
	  ExtentTest test=reports.startTest("irctc1");
	 // TakesScreenshot scrShot =((TakesScreenshot)driver);
  @Test(dataProvider = "dp")
  public void irctc(String from, String to, String date, String Classes) throws InterruptedException 
  {
	  
	  driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(from);
	  driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(to);
	  driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")).sendKeys(date);
	  Select cls=new Select(driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/label")));
	  cls.selectByVisibleText(Classes);
	  if(from==null)
		{
			test.log(LogStatus.PASS, "SUCCESS");
		}
		else
			//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  		//FileUtils.copyFile(src, new File("C:/selenium/error.png"));
			test.log(LogStatus.FAIL, "from field is empty");
			Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	 
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.irctc.co.in/nget/train-search");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { "COIMBATORE JN - CBE", "EKAMBARAKUPPAM - EKM", "19-02-2020", "First Class (FC)" },
      new Object[] { "FARINGAPETTA - FRG", "","21-02-2020", "AC 3 Tier (3A)" },
      new Object[] { "FARINGAPETTA - FRG", "EKAMBARAKUPPAM - EKM","sdf", "AC 3 Tier (3A)" },
      
      
    };
  }
}
