package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programming\\Selenium_examples\\chromedriver.exe");
		//Launch the Chrome Browser.
		WebDriver driver = new ChromeDriver(); 
		//Open the URL "http://www.selenium.dev/".
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Muhammed Irfan");

		driver.findElement(By.id("u_0_r")).sendKeys("8714360266");
		driver.findElement(By.id("u_0_w")).sendKeys("super@30");
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("4");
		Thread.sleep(3000);
		Select mon= new Select(driver.findElement(By.id("month")));
		mon.selectByVisibleText("Dec");
		Thread.sleep(3000);
		Select yr= new Select(driver.findElement(By.id("year")));
		yr.selectByVisibleText("1996");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.quit();

	}

}
