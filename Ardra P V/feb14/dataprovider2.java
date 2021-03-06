package podemo;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class dataprovider2 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	  driver=new FirefoxDriver();
      driver.get("http://demowebshop.tricentis.com");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.name("Email")).sendKeys(username);
	  driver.findElement(By.name("Password")).sendKeys(password);
	  driver.findElement(By.linkText("Tricentis")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "user1", "pass1" },
      new Object[] { "user2", "pass2"  },
      new Object[] { "user3", "pass3"  },
    };
  }
}
