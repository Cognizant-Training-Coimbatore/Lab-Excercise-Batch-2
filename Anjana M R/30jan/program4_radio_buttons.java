import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_radio_buttons {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webddriver.chrome.driver", "chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	WebElement register=driver.findElement(By.linkText("Register"));
	register.click();
	Thread.sleep(5000);
	List<WebElement>gender=(List<WebElement>) driver.findElement(By.name("Gender"));
	gender.get(1).click();
	Thread.sleep(5000);
	driver.quit();
	
	}

}
