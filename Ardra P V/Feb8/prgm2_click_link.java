package seleniumeg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prgm2_click_link {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
				//Launch the chrome browser
				WebDriver driver=new ChromeDriver();
				
				//open the url "https://www.selenium.dev/"
				driver.get("file:///D:/test/exp.html");
				WebElement link1=driver.findElement(By.linkText("Google"));
				link1.click();
				List<WebElement> radio1=driver.findElements(By.name("gender"));
				radio1.get(1).click();
				Thread.sleep(50000);
				driver.quit();

	}

}
