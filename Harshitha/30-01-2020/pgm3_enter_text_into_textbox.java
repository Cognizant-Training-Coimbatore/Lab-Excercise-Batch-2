import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3_enter_text_into_textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver","chromedriver.exe");//to launch browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");//webpage to be opened
		WebElement login=driver.findElement(By.linkText("Log in"));//for clicking link
		login.click();
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys("user1");//to enter text into textbox
		password.sendKeys("user1");
		Thread.sleep(5000);
		driver.quit();
	}

}
