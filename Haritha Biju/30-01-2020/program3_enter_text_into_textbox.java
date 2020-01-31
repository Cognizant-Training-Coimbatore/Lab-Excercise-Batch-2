import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_enter_text_into_textbox 
{

	public static void main(String[] args) throws InterruptedException //in case of exception , the Interrupt Exception willl be added
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click(); 			// to click on a link
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password= driver.findElement(By.id("Password"));
		email.sendKeys("user1"); 	// to enter a value to a textbox, use sendKeys
		password.sendKeys("user2");
		Thread.sleep(5000); 	// it will hold the program for 5000 milli seconds
		driver.quit(); // to close the browser


	}

}
