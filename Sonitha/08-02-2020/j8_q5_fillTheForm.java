import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class j8_q5_fillTheForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		driver.findElement(By.name("user_login")).sendKeys("Login");
		driver.findElement(By.name("user_password")).sendKeys("Password");
		driver.findElement(By.name("first_name")).sendKeys("First_Name");
		driver.findElement(By.name("last_name")).sendKeys("Last_Name");
		driver.findElement(By.name("email")).sendKeys("Email1234@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("address 1");	
		driver.findElement(By.name("city")).sendKeys("City");
		
		Select sel = new Select(driver.findElement(By.name("state_id")));
		sel.selectByVisibleText("Alaska");
		driver.findElement(By.name("zip")).sendKeys("11221");
		Select sel1 = new Select(driver.findElement(By.name("country_id")));
		sel1.selectByVisibleText("Angola");
		
		driver.findElement(By.name("phone_home")).sendKeys(1233432+"");
		driver.findElement(By.name("phone_work")).sendKeys(12123432+"");
		
		 sel1 = new Select(driver.findElement(By.name("language_id")));
		sel1.selectByVisibleText("French");
		
		 sel1 = new Select(driver.findElement(By.name("age_id")));
			sel1.selectByVisibleText("35-50");
		
			sel1 = new Select(driver.findElement(By.name("gender_id")));
			sel1.selectByVisibleText("Female");
			
			sel1 = new Select(driver.findElement(By.name("education_id")));
			sel1.selectByVisibleText("College");
			
			sel1 = new Select(driver.findElement(By.name("income_id")));
			sel1.selectByVisibleText("$25,000 - $34,000");
			
			driver.findElement(By.name("note")).sendKeys("describe");
			driver.findElement(By.name("Insert")).click();
			
	Thread.sleep(5000);
	driver.quit();
			
		
	}

}
