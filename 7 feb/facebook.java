package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\javaprograms\\selenium_examples\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_m")).sendKeys("kavery");
		driver.findElement(By.id("u_0_o")).sendKeys("Ramesh");
		driver.findElement(By.id("u_0_r")).sendKeys("9745477224");
		driver.findElement(By.id("u_0_w")).sendKeys("kavery123");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("29");
		
		Select Month=new Select(driver.findElement(By.id("month")));
		Month.selectByVisibleText("Apr");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		driver.findElement(By.id("u_0_6")).click();
		driver.findElement(By.id("u_0_13")).click();
		
		
	}

}
