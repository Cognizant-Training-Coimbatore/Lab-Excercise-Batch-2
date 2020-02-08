package BasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java prgms\\selenium_Examples\\chromedriver.exe");//going to control the web
		//  Launch the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("u_0_m")).sendKeys("firstname");
		 driver.findElement(By.id("u_0_o")).sendKeys("lastname");
		 driver.findElement(By.id("u_0_r")).sendKeys("emailaddress@gmail.com");
		 driver.findElement(By.id("u_0_u")).sendKeys("emailaddress@gmail.com");
		 driver.findElement(By.id("u_0_w")).sendKeys("password@#123");
		
		 Select day = new Select(driver.findElement(By.id("day")));
		 day.selectByVisibleText("28");
		 Thread.sleep(2000);
		 day = new Select(driver.findElement(By.id("month")));
		 day.selectByVisibleText("Jun");
		 Thread.sleep(2000);
		 day = new Select(driver.findElement(By.id("year")));
		 day.selectByVisibleText("1990");
         WebElement target = driver.findElement(By.id("u_0_6"));
         target.click();
         
		 driver.findElement(By.id("u_0_13")).click();
		 Thread.sleep(5000);
		 driver.quit();
		 
	}

}
