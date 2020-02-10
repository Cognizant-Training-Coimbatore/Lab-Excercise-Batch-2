package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program10_mouseActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		Actions actions = new Actions(driver);
		actions.moveToElement(computers).build().perform();
		
		driver.findElement(By.linkText("Notebooks")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
