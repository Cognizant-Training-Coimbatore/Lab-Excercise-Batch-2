package blaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	WebDriver driver;
	WebElement login;
	
homepage(WebDriver driver){
	this.driver=driver;
	
	}
void clickLogin() {
	login=driver.findElement(By.linkText("Loh in"));
	login.click();
}
}