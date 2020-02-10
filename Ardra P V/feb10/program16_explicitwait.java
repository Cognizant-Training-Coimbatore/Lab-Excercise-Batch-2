package webDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program16_explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
				//Launch the chrome browser
				WebDriver driver;
				driver =new ChromeDriver();
				WebDriverWait wait=new WebDriverWait(driver, 10);
				driver.get("http://demowebshop.tricentis.com/");
				WebElement loginlink;
				loginlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
				loginlink.click();
				driver.close();
		

	}

}
