import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class testLevel_dataprovider 
{
  WebDriver driver;
  @BeforeClass
  public void beforeMethod() 
  {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
  }

  @Test(dataProvider = "dp")
  public void login(String username, String password)
  {
	  driver.findElement(By.id("identifierId")).sendKeys(username);
	  driver.findElement(By.id("identifierNext")).click();
	 
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.id("passwordNext")).click();
  }

  @AfterClass
  public void closeBrowser()
  {
  	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "user1", "pass1" },
      new Object[] { "user2", "pass2" },
      new Object[] { "user3", "pass3" }
     };
  }



}




