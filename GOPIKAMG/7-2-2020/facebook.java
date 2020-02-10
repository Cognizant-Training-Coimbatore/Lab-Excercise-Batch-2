package basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("msdgopz777@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.name("firstname")).sendKeys("gopika");
		driver.findElement(By.name("lastname")).sendKeys("gopan");//send keys
		driver.findElement(By.name("reg_email__")).sendKeys("msdgopz777@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("msdgopz777@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		Select day =new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
		Select month =new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		Select year =new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		driver.findElement(By.id("u_0_6")).click();
		driver.findElement(By.id("u_0_13")).click();
	}

}
