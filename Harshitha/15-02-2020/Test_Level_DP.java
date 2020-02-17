package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Test_Level_DP {
	WebDriver driver;
	 @Test(dataProvider = "dp")
	  public void f(String uid, String pwd) throws InterruptedException
	  {
	 driver.findElement(By.id("identifierId")).sendKeys(uid);
	 driver.findElement(By.id("identifierNext")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.name("password")).sendKeys(pwd);
	 driver.findElement(By.id("passwordNext")).click();
	 
	  }
	  @BeforeMethod
	  public void beforeMethod()
	  {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
	 driver.quit();
	  }


	  @DataProvider
	  public Object[][] dp()
	  {
	    return new Object[][]
	    {
	      new Object[] { "harshitha", "aqwes" },
	      new Object[] { "test123", "test123" },
	    };
	  }
}