import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {

	
		WebDriver driver;
		WebElement username,password;
		login_page(WebDriver driver)
		{
			this.driver=driver;
		}
		void enterusername(String s)
		{
			username=driver.findElement(By.name("Email"));
			username.sendKeys(s);
		}
		void enterpassword(String s)
		{
			password=driver.findElement(By.name("Password"));
			password.sendKeys(s);
		}

	}
