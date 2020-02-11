package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		Actions actions = new Actions(driver);
		actions.moveToElement(computers).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Notebooks")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}