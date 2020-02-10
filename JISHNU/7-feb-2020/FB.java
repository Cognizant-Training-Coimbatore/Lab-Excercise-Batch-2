package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kyuvarajcs");
		driver.findElement(By.id("pass")).sendKeys("kyuvarajcs");
		//driver.findElement(By.id("u_0_b")).click();
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
		Thread.sleep(6000);
		driver.close();
	}

}
