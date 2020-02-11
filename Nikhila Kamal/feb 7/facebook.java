package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("nikhilakamalk@gmail.com");
		//driver.findElement(By.name("email")).submit();
		driver.findElement(By.name("pass")).sendKeys("nikhila@1994");
		//driver.findElement(By.id("u_0_b")).submit();
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
	}

}
