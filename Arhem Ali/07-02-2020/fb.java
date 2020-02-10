package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium_example\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("jaseem");
		driver.findElement(By.name("lastname")).sendKeys("valli");
		driver.findElement(By.name("reg_email__")).sendKeys("valli@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vallii");
		Select d= new Select(driver.findElement(By.id("day")));
		d.selectByVisibleText("2");
		Select m= new Select(driver.findElement(By.id("month")));
		m.selectByVisibleText("Jul");
		Select y= new Select(driver.findElement(By.id("year")));
		y.selectByVisibleText("1997");
		WebElement n=driver.findElement(By.id("u_0_7"));
		n.click();
		WebElement c=driver.findElement(By.linkText("Sign Up"));
		c.click();
		
		
		
		
				



	}
}