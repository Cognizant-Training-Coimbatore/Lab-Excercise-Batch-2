package selenium_new;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\selenium_new\\src\\selenium_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("http://demowebshop.tricentis.com");
		WebElement loginlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
		loginlink.click();
		driver.close();
	}

}
