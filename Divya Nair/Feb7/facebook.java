import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java programs CBE\\Webdriver-Demo\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("divya123");
		driver.findElement(By.id("pass")).sendKeys("divu");
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		driver.findElement(By.name("lastname")).sendKeys("Nair");
		driver.findElement(By.name("reg_email__")).sendKeys("divyanair996@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("divun");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(11);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1996");
		WebElement radio1=driver.findElement(By.name("sex"));
		radio1.click();
		
		
		

	}

}
