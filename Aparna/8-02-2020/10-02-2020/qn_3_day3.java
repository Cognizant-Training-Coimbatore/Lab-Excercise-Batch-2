package selenium_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qn_3_day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\selenium_new\\src\\selenium_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
		Actions actions=new Actions (driver);
		actions.moveToElement(computers).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accessories")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}