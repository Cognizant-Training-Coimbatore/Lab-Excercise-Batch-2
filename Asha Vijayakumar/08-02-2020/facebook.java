package selenium_examples1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Firstname,Surname,Mobilenumber,Newpassword;
		Firstname=driver.findElement(By.name("firstname"));
		Surname=driver.findElement(By.name("lastname"));
		Mobilenumber=driver.findElement(By.id("u_0_r"));
		Newpassword=driver.findElement(By.id("u_0_w"));
		Firstname.sendKeys("asha");
		Surname.sendKeys("vijayakumar");
		Mobilenumber.sendKeys("9674532190");
		Newpassword.sendKeys("asha@123");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("25");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Oct");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1998");
		driver.findElement(By.id("u_0_6"));
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		

	}

}
