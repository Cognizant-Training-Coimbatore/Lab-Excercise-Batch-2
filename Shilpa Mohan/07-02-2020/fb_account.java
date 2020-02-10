package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_m")).sendKeys("Shilpa");
		driver.findElement(By.id("u_0_o")).sendKeys("Mohan");
		driver.findElement(By.id("u_0_r")).sendKeys("9605397680");
		driver.findElement(By.id("u_0_w")).sendKeys("sreekrishna123");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("17");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Mar");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1998");
		driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.id("u_0_13")).click();

	}

}
