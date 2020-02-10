package basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Selenium_Examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();//for maximizing browser
		driver.findElement(By.name("email")).sendKeys("harsha");
		driver.findElement(By.name("pass")).sendKeys("qwerty");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
	}

}
