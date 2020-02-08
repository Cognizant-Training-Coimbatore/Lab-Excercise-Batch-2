package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class feb7_facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\stani\\java\\selenium_examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("stani");
		driver.findElement(By.name("lastname")).sendKeys("thomas");
		driver.findElement(By.name("reg_email__")).sendKeys("6123456789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("asdf1234");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("11");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("May");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		driver.findElement(By.id("u_0_7")).click();
		Thread.sleep(8000);
		driver.quit();
	}

}
