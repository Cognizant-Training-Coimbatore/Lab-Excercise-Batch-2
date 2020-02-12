import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day3_ex3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
		Actions action=new Actions(driver);
		action.moveToElement(computers).build().perform();
		driver.findElement(By.linkText("Accessories")).click();
		Thread.sleep(5000);
		driver.quit();
				

	}

}