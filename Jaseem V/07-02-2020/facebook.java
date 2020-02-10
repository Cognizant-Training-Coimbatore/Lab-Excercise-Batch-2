package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java Programs\\selenium examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_m")).sendKeys("Jaseem");
		driver.findElement(By.id("u_0_o")).sendKeys("Vallanchira");
		driver.findElement(By.id("u_0_r")).sendKeys("9633415857");
		driver.findElement(By.id("u_0_w")).sendKeys("Jaseem@123");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("12");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Aug");
		Select year =new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1996");
		WebElement Gender = driver.findElement(By.id("u_0_a"));
		Gender.click();
		WebElement sign_up =driver.findElement(By.linkText("Sign Up"));
		sign_up.click();
	}

}
