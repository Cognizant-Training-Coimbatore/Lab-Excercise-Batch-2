package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Sreelakshmy");
		driver.findElement(By.name("lastname")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("sreelakshmyv.mec@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("qwert123@");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sreelakshmyv.mec@gmail.com");
		Select day=new Select(driver.findElement(By.id("day"))) ;
		day.selectByVisibleText("11");
		Select month=new Select(driver.findElement(By.id("month"))) ;
		month.selectByVisibleText("Nov");
		Select year=new Select(driver.findElement(By.id("year"))) ;
		year.selectByVisibleText("1997");
		driver.findElement(By.id("u_0_6")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
	}

}
