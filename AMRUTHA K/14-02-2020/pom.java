package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom {
WebDriver driver;
WebElement login;
  public pom(WebDriver driver){
	this.driver=driver;
	}
  void clickLogin() {
	  login=driver.findElement(By.linkText("Log in"));
	  login.click();
  }
  
  
}
