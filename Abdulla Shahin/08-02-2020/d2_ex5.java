import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class d2_ex5 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("iamshaheen");
		driver.findElement(By.name("user_password")).sendKeys("pass123$");
		driver.findElement(By.name("first_name")).sendKeys("Will");
		driver.findElement(By.name("last_name")).sendKeys("Smith");
		driver.findElement(By.name("email")).sendKeys("shaheengps@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Mundol Villa");
		driver.findElement(By.name("address2")).sendKeys("Citizen nagar");
		driver.findElement(By.name("address3")).sendKeys("Kasaragod");
		driver.findElement(By.name("city")).sendKeys("Kasaragod");
		Select state = new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("New York");
		driver.findElement(By.name("zip")).sendKeys("67154");
		Select country = new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("India");
		driver.findElement(By.name("phone_home")).sendKeys("223344");
		driver.findElement(By.name("phone_work")).sendKeys("223355");
		Select language = new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("German");
		Select age = new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("18-24");
		Select gender = new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Male");
		Select edu = new Select(driver.findElement(By.name("education_id")));
		edu.selectByVisibleText("College");
		Select income = new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("over $75,000");
		driver.findElement(By.name("note")).sendKeys("I am a foodieeee...");
		WebElement link1 = driver.findElement(By.name("Insert"));
		link1.click();
		driver.quit();
		
	}

}
