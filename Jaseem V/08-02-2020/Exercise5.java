import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		 driver.findElement(By.name("user_login")).sendKeys("Jaseem123");
		 driver.findElement(By.name("user_password")).sendKeys("pass123@");
		 driver.findElement(By.name("first_name")).sendKeys("Jaseem");
		 driver.findElement(By.name("last_name")).sendKeys("Vallanchira");
		 driver.findElement(By.name("email")).sendKeys("jaseemv96@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("Vallanchira House");
		 driver.findElement(By.name("address2")).sendKeys("Manjeri College post");
		 driver.findElement(By.name("address3")).sendKeys("Manjeri");
		 driver.findElement(By.name("city")).sendKeys("Malappuram");
		 Select combo1 = new Select(driver.findElement(By.name("state_id")));
			combo1.selectByVisibleText("Texas");
		 driver.findElement(By.name("zip")).sendKeys("12345");
		 Select combo2 = new Select(driver.findElement(By.name("country_id")));
			combo2.selectByVisibleText("Canada");
		 driver.findElement(By.name("phone_home")).sendKeys("9633415857");
		 driver.findElement(By.name("phone_work")).sendKeys("9895857840");
		 Select combo3 = new Select(driver.findElement(By.name("language_id")));
			combo3.selectByVisibleText("English");
		 Select combo4 = new Select(driver.findElement(By.name("age_id")));
				combo4.selectByVisibleText("18-24");
		 Select combo5 = new Select(driver.findElement(By.name("gender_id")));
					combo5.selectByVisibleText("Male");
		 Select combo6 = new Select(driver.findElement(By.name("education_id")));
						combo6.selectByVisibleText("College");
	     Select combo7 = new Select(driver.findElement(By.name("income_id")));
						combo7.selectByVisibleText("under $25,000");
		driver.findElement(By.name("note")).sendKeys("Love to read novels and long stories");			
		WebElement register = driver.findElement(By.name("Insert"));
		register.click();
		Thread.sleep(5000);
		driver.close();
	}

}