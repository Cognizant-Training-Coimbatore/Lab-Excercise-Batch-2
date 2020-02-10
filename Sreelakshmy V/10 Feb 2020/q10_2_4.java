package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class q10_2_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
	Actions actions=new Actions(driver);
	actions.moveToElement(computers).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Notebooks")).click();
	Thread.sleep(5000);
	driver.quit();
	}

}
