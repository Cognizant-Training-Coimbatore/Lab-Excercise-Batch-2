import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Nagative {
	//Locators
		private By login1=By.linkText("Login");
		private By mob=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
		private By pwd=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
		private By login2=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	
  @Test(dataProvider = "dp")
  public void f(String phone, String pass) throws InterruptedException, IOException {
	 
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 ExtentReports report=new ExtentReports("Negative.html");
			ExtentTest test= report.startTest("testcase1");
			driver.get("https://www.flipkart.com/");
			
			//driver.findElement(login1).click();
			driver.findElement(mob).sendKeys(phone);
			driver.findElement(pwd).sendKeys(pass);
			driver.findElement(login2).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("test negative");
			Thread.sleep(3000);
			if(driver.findElement(mob).isDisplayed())
			{
				test.log(LogStatus.PASS, "test pass");
			}
			else
			{
				test.log(LogStatus.FAIL, "test fail");
			}
			Thread.sleep(3000);
			report.endTest(test);
			report.flush();
			driver.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "1234", "passs123" },
      
    };
  }
}
