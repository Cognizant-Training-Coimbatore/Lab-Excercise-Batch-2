import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataprovider_2 {

  @Test(dataProvider = "dp")
  public void f(String username, String password) 
  {
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.name("Email")).sendKeys(username);
	  driver.findElement(By.name("Password")).sendKeys(password);
	  driver.findElement(By.linkText("Tricentis")).click();
	  driver.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "anjana", "12334" },
      new Object[] { "anu", "1222" },
    };
  }
}
