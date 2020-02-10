import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait:it will wait for 10seconds for every step
		//Purpose of Implicit Wait: few steps may take more time forthat time immediately this error shouldnot come
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in1")).click();
		
		driver.quit();

	}

}
